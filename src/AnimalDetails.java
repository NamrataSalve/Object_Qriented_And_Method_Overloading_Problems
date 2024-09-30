class Dog {
    private String breed;
    private int age;
    private double weight;

    public Dog(String breed, int age, double weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public int calculateHumanYears() {
        return age * 7;
    }

    public void printDetails() {
        System.out.println("Breed: " + breed);
        System.out.println("Age (dog years): " + age);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Age (human years): " + calculateHumanYears());
    }
}
public class AnimalDetails {
    public static void main(String[] args) {
    Dog d1 = new Dog("Labrador",5,6);
    d1.calculateHumanYears();
    d1.printDetails();
    }
}
