
package hashset;

import java.util.HashSet;

public class HashsetDemo {
    
    public static void main(String[] args) {
        
        HashSet<String> s=new HashSet<String>();
        
        s.add("Apple");
        s.add("Orange");
        s.add("Banana");
        s.add("Mango");
        s.add("Banana");
        
        
        System.out.println(s);
        
        s.remove("hp");
        s.remove("Orange");
  
        System.out.println(s);
    }
    
}
