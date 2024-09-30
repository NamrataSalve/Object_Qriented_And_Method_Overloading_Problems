class Shirt{
  private  String size;
  private   double price;
  private String color;

    Shirt(String size, double price, String color)
    {
        this.size=size;
        this.price=price;
        this.color=color;
    }

    public double calculateDiscount()
    {
        double discount = 0.0;
        switch (size.toUpperCase())
        {
            case "S":
                discount = 0.5;
                break;
            case "M":
                discount = 0.10;
                break;
            case "L":
                discount = 0.15;
                break;
            default:
                discount = 0.0;
                break;
        }
        return price*(1-discount);
    }

    public void shirtDetail(){
    double discountedPrice = calculateDiscount();
        System.out.println("Shirt size is: "+size);
        System.out.println("Shirt original price is: "+price);
        System.out.println("After discount price is: "+discountedPrice);
    }
}
public class ClothFactory {
    public static void main(String[] args) {
    Shirt s1 = new Shirt("S",500,"Blue");
    s1.calculateDiscount();
    s1.shirtDetail();
    }
}
