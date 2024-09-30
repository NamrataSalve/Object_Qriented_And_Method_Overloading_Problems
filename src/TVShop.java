class TV{
    private String brand;
    private int size;
    private double price;

    public TV(String brand, int size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    public double calculateDiscount() {
        double discount = 0.0;

        if (size > 50) {
            discount = 0.20;
        } else if (size > 40) {
            discount = 0.15;
        } else if (size > 30) {
            discount = 0.10;
        }

        return price * discount;
    }
    public double calculateDiscountedPrice() {
        return price - calculateDiscount();
    }

    public void printDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size + " inches");
        System.out.println("Original Price: $" + price);
        System.out.println("Discounted Price: $" + calculateDiscountedPrice());
    }

}
public class TVShop {
    public static void main(String[] args) {
        TV tv1 = new TV("Sony",50,5000);
        tv1.calculateDiscount();
        tv1.calculateDiscountedPrice();
        tv1.printDetails();

    }
}
