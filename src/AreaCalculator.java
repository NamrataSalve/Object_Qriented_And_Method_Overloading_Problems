import java.util.Scanner;

class Shape{
    double height;
    double length;
    double breath;

    Shape(double length , double breath)
    {
        this.breath=breath;
        this.length=length;
    }
    Shape(double height,double breath, double length)
    {
        this.breath=breath;
        this.length=length;
        this.height=height;
    }
    double getAreaOfRectangle()
    {
        return length*breath;
    }
    double getAreaOfTriangle()
    {
        return 0.5*(breath*height);
    }
}
public class AreaCalculator {
    public static Shape getRectangleInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        double length = sc.nextDouble();
        System.out.println("Enter the breath of rectangle: ");
        double breath = sc.nextDouble();
        return new Shape(length,breath);
    }

    public static Shape  getTriangleInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base length of Triangle: ");
        double length = sc.nextDouble();
        System.out.println("Enter height of the Triangle: ");
        double height = sc.nextDouble();
        System.out.println("Enter breadth of the Triangle: ");

        double breath = sc.nextDouble();
        return new Shape(length, height, breath);
    }

    public static void main(String[] args) {
        Shape rectangle = getRectangleInput();
        Shape triangle = getTriangleInput();

        double rectangleArea = rectangle.getAreaOfRectangle();
        double triangleArea = triangle.getAreaOfTriangle();

        System.out.println("The Area of rectangle is: "+rectangleArea);
        System.out.println("The Area of triangle is : "+triangleArea);
    }
}
