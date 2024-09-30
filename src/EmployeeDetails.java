class Employee{
    private String name;
    private double salary;
    private int id;

    Employee(String name,double salary, int id)
    {
        this.name=name;
        this.salary=salary;
        this.id=id;
    }

    public double calculateSalary()
    {
        return salary*12;
    }
    public void printDetails()
    {
        double yearlySalary = calculateSalary();
        System.out.println("Employee name is: "+name);
        System.out.println("Employee monthly salary is: "+salary);
        System.out.println("Employee Id is: "+id);
        System.out.println("Employee's Yearly salary is: "+yearlySalary);
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
    Employee e1 = new Employee("Namrata",50000,101);
    e1.calculateSalary();
    e1.printDetails();
    }
}
