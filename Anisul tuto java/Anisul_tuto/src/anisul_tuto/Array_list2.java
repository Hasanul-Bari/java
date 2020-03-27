package anisul_tuto;

import java.util.ArrayList;

public class Array_list2 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> arr1 =new ArrayList<>();
        ArrayList<Integer> arr2 =new ArrayList<>();
        ArrayList<Integer> arr3 =new ArrayList<>();
        
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        arr1.add(40);
        System.out.println("arr1 = "+arr1);
        
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);
        System.out.println("arr2 = "+arr2);
        
        arr3.addAll(arr1);
        System.out.println("arr3 = "+arr3);
        
        boolean result=arr2.equals(arr3);
        System.out.println("arr2==arr3 = "+result);
        
        result=arr1.equals(arr3);
        System.out.println("arr1==arr3 = "+result);
        
        
        
                
        
    }
    
}
