class BankDetails{
    private double balance;
    private long acNumber;

    BankDetails(double balance, long acNumber)
    {
        this.balance=balance;
        this.acNumber=acNumber;
    }

    public void depositMoney(double amount)
    {
        if(amount>0)
        {
            System.out.println("Before Depositing cash: "+balance);
            balance = balance+amount;
            System.out.println("Deposited cash is: "+amount);
            System.out.println("Total Balance is : "+balance);
        }
        else
            System.out.println("Deposit money must be positive...");
    }

    public void withDrawCash(double amount){
        if(amount>0 && amount<=balance)
        {
            balance=balance-amount;
            System.out.println("The withdraw cash is: "+amount);
            System.out.println("After withdrawing cash the balance is: "+balance);
        }
        else if(amount>balance)
            System.out.println("Insufficient balance...");
        else
            System.out.println("Please enter correct amount..");
    }
}
public class Bank {
    public static void main(String[] args) {
    BankDetails b1 = new BankDetails(50000,123145661);
    b1.depositMoney(50000);
    b1.withDrawCash(80000);
    }
}
