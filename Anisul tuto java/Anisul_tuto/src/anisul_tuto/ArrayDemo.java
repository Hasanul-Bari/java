package anisul_tuto;

import java.util.Scanner;

public class ArrayDemo {
    
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        
        int n;
        System.out.println("Enter the size of the array");
        n=input.nextInt();
        
        int [] arr;
        arr= new int [n];
        System.out.println("Array size = "+arr.length);
        
        for (int i = 0; i < n; i++) 
        {
            arr[i]=input.nextInt();
        }
        
        for (int i = 0; i < n; i++)
        {
            System.out.println(arr[i]);  
        }
        
        System.out.println("Array size = "+arr.length);
    }
    
}
