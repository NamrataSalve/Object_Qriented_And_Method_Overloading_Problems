public class Car extends Vehichle{

    @Override
    public void getObjectType(Object obj) {
        if(obj instanceof Car){
            System.out.println("Is A Car");
            return;
        }
        System.out.println("Is not a vehichle");
    }
}
