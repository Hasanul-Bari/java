package anisul_tuto;

import java.util.Scanner;


public class Array2d {
    
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        int r,c;
        System.out.println("Enter the no of rows and columns");
        r=input.nextInt();
        c=input.nextInt();
        
        int [][] arr= new int [r][c];
        
        System.out.println("Enter the elements :");
        
        for (int i = 0; i < r; i++) 
        {
            for(int j=0; j<c; j++)
            {
                System.out.print("a["+i+"]["+j+"] = ");
                arr[i][j]=input.nextInt();
            }
        }
        
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        
        
        
    }
    
}
