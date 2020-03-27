package anisul_tuto;

import java.util.Scanner;

public class _11_input_demo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num;
        num=input.nextInt();
        
        System.out.println("num = "+num);
        
        double x;
        x=input.nextDouble();
        System.out.println("x = "+x);
        
        char c;
        c=input.next().charAt(0);
        System.out.println("c = "+c);
        
        
        String s;
        s=input.next();
        
        System.out.println("s = "+s);
 
        
        /*s=input.nextLine();
        System.out.println("s = "+s);*/
        
        
                  
    }
    
}