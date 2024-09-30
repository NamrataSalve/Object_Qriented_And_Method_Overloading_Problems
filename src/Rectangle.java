public class Rectangle extends Square{

    @Override
    public void printArea(int length, int breadth) {
//        super.printArea(length, breadth);
        System.out.println("Area of rectangle : "+ length*breadth);
    }
}
