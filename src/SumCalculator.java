import java.util.Scanner;
public class SumCalculator {
    public static int input(String prompt)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt );
        return sc.nextInt();
    }

    public static int add(int num1, int num2)
    {
        return num1+num2;
    }

    public static void main(String[] args) {
        int num1 = input("Enter first number: ");
        int num2 = input("Enter second number: ");

        int result = add(num1,num2);

        System.out.println("Addition of two numbers is : "+result);
    }
}
