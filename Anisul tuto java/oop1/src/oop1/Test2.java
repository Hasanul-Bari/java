package oop1;


public class Test2 {
    
    public static void main(String[] args) {
        
        Teacher t = new Teacher();
        
        
        t.setInfo("hasan", "male", 154862);
        
        t.display();
        
        System.out.println("t's phone no = "+t.getphone());
    }
}
