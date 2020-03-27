
package lab3;

import java.util.logging.Level;
import java.util.logging.Logger;


public class MainClass extends Mythread {
    
    public static void main(String[] args) {
        Mythread ob=new Mythread();
        
        for(int i=1; i<=100; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            System.out.printf("parent %d\n",i);
        }
        
    }
    
}
