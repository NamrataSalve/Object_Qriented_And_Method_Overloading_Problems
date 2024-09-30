public class Truck extends Vehichle{
    @Override
    public void getObjectType(Object obj) {
        if(obj instanceof Truck){
            System.out.println("Is Truck");
            return;
        }
        System.out.println("Not a vehichle");
    }
}
