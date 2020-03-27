package method_overriding;


public class Test {
    public static void main(String[] args) {
        
        Teacher t1=new Teacher();
        
        t1.name="Hasanhp";
        t1.age=21;
        t1.qualification="Bsc in CSE";
        
        t1.DisplayInformation();
        
        Person p1=new Person();
        p1.name="hp7";
        p1.age=23;
        p1.DisplayInformation();
    }
}
