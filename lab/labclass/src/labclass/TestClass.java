
package labclass;


public class TestClass {
    
    public static void main(String[] args) {
        
        A obA=new A();
        String s=obA.add("hasan","hp");
        System.out.println(s);
        
        int x=obA.add(12,15);
        System.out.println(x);
        
        B obB=new B();
        
        s=obB.add("Hasanul","Bari");
        System.out.println(s);
        
        x=obB.add(5,6);
        System.out.println(x);
        
        
        A ob1=new A();
        B ob2=new B();
        
        ob1=ob2;
        
        s=ob1.add("Hasan","HPP");
        System.out.println(s);
        
        
        /*A ob3=new A();
        B ob4=new B();
        
        ob4=(B) ob3;
        
        s=ob4.add("Hasan","HPP");
        System.out.println(s);*/
        
        
        
        
        
        
    }
    
}
