
package method_overloading;

public class Test {
    public static void main(String[] args) {
        
        Overload obj=new Overload();
        
        obj.add();
        obj.add(2,3);
        obj.add(2.5,3.2);
        obj.add(2,4,3);
        
    }
    
}
