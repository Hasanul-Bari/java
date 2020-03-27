
package HashMap;

import java.util.HashMap;

public class HashMapDemo {
    
   
    public static void main(String[] args) {
        
        HashMap<Integer,String> m=new HashMap<Integer,String>();
        
        m.put(101,"Hasan");
        m.put(102,"HP");
        m.put(103,"Bari");
        
        System.out.println(m.get(103));
        
    }
    
}
