package anisul_tuto;

import java.util.Random;


public class RandomNumberDemo {
    
    public static void main(String[] args) {
        
        Random rand=new Random();
        
        int x=rand.nextInt(6)+5;
        System.out.println("x= "+x);
        
        int y= (int)(Math.random()*6);
        System.out.println("y= "+y);
    }
    
}
