class Student{
    public static int count=0;

    Student(){
        count++;
    }

    public static int getObjectCount()
    {
        return count;
    }
}
public class ObjectCounter {
    public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();
    Student s3 = new Student();

        System.out.println("The Object count is: "+Student.getObjectCount());
    }
}
