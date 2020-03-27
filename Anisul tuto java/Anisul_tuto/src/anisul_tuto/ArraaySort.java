package anisul_tuto;


import java.util.Arrays;
import java.util.Scanner;

public class ArraaySort {
    
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        
        int n;
        n=input.nextInt();
        
        int[] a=new int [n];
        
        for (int i = 0; i < n; i++) {
            a[i]=input.nextInt();   
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");   
        }
        System.out.println();
        
        Arrays.sort(a);
        
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");   
        }
        System.out.println();
        
        
        
    }
    
}
