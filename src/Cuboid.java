import java.util.Scanner;

public class Cuboid {

    // Method to calculate the perimeter of the base of the cuboid
    public int perimeter(int length, int breadth) {
        return 2 * (length + breadth);
    }

    // Method to calculate the area of the base of the cuboid, which calls the perimeter method
    public int area(int length, int breadth) {
        int perimeter = perimeter(length, breadth);
        System.out.println("Perimeter of the base: " + perimeter);
        return length * breadth;
    }

    // Method to calculate the volume of the cuboid, which calls the area method
    public int volume(int length, int breadth, int height) {
        int area = area(length, breadth);
        System.out.println("Area of the base: " + area);
        return area * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for length, breadth, and height
        System.out.print("Enter the length of the cuboid: ");
        int length = scanner.nextInt();
        System.out.print("Enter the breadth of the cuboid: ");
        int breadth = scanner.nextInt();
        System.out.print("Enter the height of the cuboid: ");
        int height = scanner.nextInt();

        // Creating an object of the Cuboid class
        Cuboid cuboid = new Cuboid();

        // Calculating and printing the volume, which will also print the area and perimeter
        int volume = cuboid.volume(length, breadth, height);
        System.out.println("Volume of the cuboid: " + volume);
    }
}
