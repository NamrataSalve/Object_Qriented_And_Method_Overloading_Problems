
class Phone {
    private String make;
    private String model;
    private int storage;

    public Phone(String make, String model, int storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;
    }

    public double calculatePrice() {
        double basePrice = 300; // Base price for a phone
        double makeMultiplier = 1.0;
        double modelMultiplier = 1.0;

        // Adjust price based on make
        switch (make.toLowerCase()) {
            case "apple":
                makeMultiplier = 1.5;
                break;
            case "samsung":
                makeMultiplier = 1.3;
                break;
            case "google":
                makeMultiplier = 1.2;
                break;
            default:
                makeMultiplier = 1.0;
        }

        if (model.toLowerCase().contains("pro")) {
            modelMultiplier = 1.2;
        } else if (model.toLowerCase().contains("plus")) {
            modelMultiplier = 1.1;
        }

        double storageMultiplier = 1 + (storage / 100.0);

        return basePrice * makeMultiplier * modelMultiplier * storageMultiplier;
    }

    public void printDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Price: $" + calculatePrice());
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
public class PhoneDetails {
        public static void main(String[] args) {
            Phone myPhone = new Phone("Apple", "iPhone 14 Pro", 256);
            myPhone.printDetails();
            myPhone.setMake("Samsung");
            myPhone.setModel("Galaxy S22 Plus");
            myPhone.setStorage(128);
            System.out.println("\nUpdated Details:");
            myPhone.printDetails();
        }


}
