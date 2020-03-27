
package inheritance;


public class Test {
    
    public static void main(String[] args) {
        
        Teacher t1=new Teacher();
        /*t1.name="hp7";
        t1.age=21;
        t1.qualification="Bsc in CSE";*/
        
        t1.setName("Hp7");
        t1.setAge(21);
        t1.setQualification("Bsc in CSE");
    
        t1.display2();
    }
    
    
}
