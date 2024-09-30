public class ArithmeticSum {

    // Method to find sum of 2 variables
    public int sum(int a, int b) {
        return a + b;
    }

    // Method to find sum of 3 variables
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Method to find sum of 4 variables
    public int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        ArithmeticSum arithmeticSum = new ArithmeticSum();

        // Call sum method with 2 arguments
        int result1 = arithmeticSum.sum(5, 10);
        System.out.println("Sum of 2 variables: " + result1);

        // Call sum method with 3 arguments
        int result2 = arithmeticSum.sum(5, 10, 15);
        System.out.println("Sum of 3 variables: " + result2);

        // Call sum method with 4 arguments
        int result3 = arithmeticSum.sum(5, 10, 15, 20);
        System.out.println("Sum of 4 variables: " + result3);
    }
}
