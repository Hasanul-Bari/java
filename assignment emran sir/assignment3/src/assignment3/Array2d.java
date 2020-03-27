package assignment3;

import java.util.Scanner;

public class Array2d {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the 2D array (n X n) : ");
        int n;
        n = input.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        boolean c = true;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if( (i==j) && (arr[i][j]!=1) )
                {
                    c=false;
                }
                else if( (i+j==n-1) && (arr[i][j]!= 1) )
                {
                    c=false;
                }
                else if(i!=j && i+j!=n-1 && arr[i][j]!=0)
                {
                    c=false;
                }
                
                //System.out.println(arr[i][j]+" "+c+" "+i+" "+j);
                
                if(c==false)
                    break;
            }
            if(c==false)
                break;
        }
        
        if(c==true)
            System.out.println("This 2D array forms a cross(X) ");
        else
            System.out.println("This 2D array does not form a cross(X) ");
            
        
    }

}


