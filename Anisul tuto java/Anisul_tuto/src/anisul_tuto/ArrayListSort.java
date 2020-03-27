package anisul_tuto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSort {
    
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        
        ArrayList<Integer> arr= new ArrayList<>();
        
        int n,x;
        n=input.nextInt();
        
        for(int i=0; i<n; i++){
            x=input.nextInt();
            arr.add(x);
        }
        System.out.println("before sort = "+arr);
                
        
        Collections.sort(arr);
        System.out.println("After sort = "+arr);
        
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println("After sort = "+arr);
        

      
        
        
        
    }
    
}
