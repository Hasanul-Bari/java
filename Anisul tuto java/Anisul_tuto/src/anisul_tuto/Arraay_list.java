package anisul_tuto;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraay_list {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        System.out.println("Size = "+arr.size());
        
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(3,40);  //3 no index a 40 assign hbe,, a[3]=4;
        
       
        
        System.out.println(arr);
        System.out.println("Size = "+arr.size());
        
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        
        Iterator itr= arr.iterator();
        
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        
        int pos=arr.indexOf(30);
        System.out.println("Index = "+pos);
        
        
        // set get method 
        arr.set(2, 65);
        System.out.println("After setting : "+arr);
        
        int a=arr.get(1);
        System.out.println("After getiing index  = "+a);
        
        
        arr.remove(1);
        System.out.println("Size = "+arr.size());
        System.out.println(arr);
        
        /*arr.removeAll(arr);
         System.out.println("Size = "+arr.size());
        System.out.println(arr);*/
        
        arr.clear();
        System.out.println("Size = "+arr.size());
        System.out.println(arr);
        
        boolean x=arr.isEmpty();
        System.out.println("ArrayList empty : "+x);
        
        x=arr.contains(30);
        System.out.println("30 is in the list : "+x);
    }
    
    
}
