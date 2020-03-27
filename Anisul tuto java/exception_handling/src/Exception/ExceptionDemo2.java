package Exception;

import java.util.Scanner;


public class ExceptionDemo2 {
    
    static int division(int x,int y) //throws ArithmeticException
    {
        return x/y;
    }
    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        try{
            int x,y;
            x=input.nextInt();
            y=input.nextInt();
            
            int z;
            z = division(x,y);
              
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        System.out.println("THE END");
    }
    
   
    
}
