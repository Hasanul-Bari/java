
package abstraction;

public class Test {
    
    public static void main(String[] args) {
        
        //MobileUser mu=new MobileUser();   // can't initiated an abstract class
        
        MobileUser mu;  //reference create kra jabe  //reference variable
        
        mu=new Rahim();
        mu.sendMessage();
        mu.call();
        
        mu=new Karim();
        mu.sendMessage();
        mu.call();
    }
    
}
