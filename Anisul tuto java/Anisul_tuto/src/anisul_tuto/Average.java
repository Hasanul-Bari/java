package anisul_tuto;

import java.util.Scanner;

public class Average {
    
    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);
        
        int n,sum=0;
        System.out.println("Enter the size of the array");
        n=in.nextInt();
        
        int [] a= new int [n];
        
        for (int i=0; i<n; i++)
        {
            a[i]=in.nextInt();
            sum=sum+a[i];
        }
        
        System.out.println("Sum = "+sum);
        double avg=sum/(double)n;
        System.out.println("Avg = "+avg);
        
        int max=a[0],min=a[0];
        for (int i = 1; i < n; i++) 
        {
            if(max<a[i])
                max=a[i];
            if(min>a[i])
                min=a[i];
        }
        System.out.println("max = "+max);
        System.out.println("min = "+min);
        
        
        
    }
    
}
