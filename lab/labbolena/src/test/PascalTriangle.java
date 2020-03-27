
package test;

import java.util.Scanner;

/**
 *
 * @author Oishe
 */
public class PascalTriangle {
      Scanner input =new Scanner(System.in);
        
        int n;
       
        int [] arr;
        arr= new int [n];
       
       
        
        for (int i = 0; i < n; i++)
        {
            System.out.println(arr[i]);  
        }
        
        System.out.println("Array size = "+arr.length);
    }
    for(int i=0;i<8;i++)
    {
        for(int j=0;j<i;j++)
        {
             arr[i][j]=input.nextInt();
        }
    }
    public static void checkTriangle()
    {
        
    }
    public static int checkTriangle( PascalTriangle p1, PascalTriangle p2)
    {
        
    }
    
}
