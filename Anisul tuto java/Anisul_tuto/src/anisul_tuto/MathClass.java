package anisul_tuto;


import java.util.Scanner;


public class MathClass {
    
    public static void main(String[] args) {
        
        Scanner input=new Scanner (System.in);
        
        int x,y,ans;
        x=input.nextInt();
        y=input.nextInt();
        
        ans=Math.abs(x-y);
        System.out.println("Math.abs(x-y) = "+Math.abs(x-y));
        System.out.println("Math.abs(x-y) = "+ans);
        
        System.out.println("Math.max(x,y) = "+Math.max(x, y));
        System.out.println("Math.min(x,y) = "+Math.min(x, y));
        
        
        System.out.println("Math.pow(x,y) = "+Math.pow(x, y));
        System.out.println("Math.sqrt(x) = "+Math.sqrt(x));
        System.out.println("Math.cbrt(x) = "+Math.cbrt(x));
        
        
        System.out.println("Math.round(x) = "+Math.round(8.8f));
        
        double z=Math.PI;
        System.out.println("Pi = "+z);
        System.out.println("e = "+Math.E);
        
       
            
        
        
        
        
  
    }
    
}
