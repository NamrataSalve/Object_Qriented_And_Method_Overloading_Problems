public class Bike extends Vehichle{
    @Override
    public void getObjectType(Object obj) {
        if(obj instanceof Bike){
            System.out.println("This is a bike");
            return;
        }
        System.out.println("Is not a vehichle");
    }
}
