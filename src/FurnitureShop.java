
class Furniture{
    private String type;
    private String material;
    private double price;

    Furniture(String type, String material, double price)
    {
        this.type=type;
        this.material=material;
        this.price=price;
    }

    public double calculateDiscount(){
        double discount = 0.0;
        switch (material.toLowerCase())
        {
            case "wood":
                discount = 0.2;
                break;
            case  "metal":
                discount = 0.3;
                break;
            case "plastic":
                discount = 0.9;
                break;
            default:
                discount = 0.0;
                break;
        }
        return price*(1-discount);
    }

    public void printDetails()
    {
        double discountedPrice = calculateDiscount();
        System.out.println("Type of material is: "+material);
        System.out.println("Type of Furniture is: "+type);
        System.out.println("Price of Furniture is: "+price);
        System.out.println("After discount price is: "+discountedPrice);
    }
}

public class FurnitureShop {
    public static void main(String[] args) {
    Furniture f1 = new Furniture("Table","Wood",4000);
    f1.calculateDiscount();
    f1.printDetails();
    Furniture f2 = new Furniture("Chair","Metal",6000);
    f2.calculateDiscount();
    f2.printDetails();
    }
}
