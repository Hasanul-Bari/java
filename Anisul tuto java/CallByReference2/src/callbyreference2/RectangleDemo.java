
package callbyreference2;

class Rectangle{
    double length;
    double depth;
}

public class RectangleDemo {
    
    public static void main(String[] args) {
        
        Rectangle r1=new Rectangle();
    
        Rectangle r2=r1;
    
        r1.length=10;
        r2.length=20;
        
        System.out.println("r1.length = "+r1.length);
        System.out.println("r2.length = "+r2.length);
    }
    
}
