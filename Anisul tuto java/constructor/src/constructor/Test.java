package constructor;

public class Test {
    
    public static void main(String[] args) {
        
               
        Teacher t = new Teacher("hasan","male",14655);  //initializing while creating with constructor
        
        
        t.display();
        
        Teacher t2=new Teacher(); //default constructor call
        t2.display();
        
        Teacher t3=new Teacher("hp7","male");
        t3.display();
    }
}
