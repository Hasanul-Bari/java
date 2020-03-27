package static_method;


public class Test {
    
    public static void main(String[] args) {
        
        StaticMethod ob=new StaticMethod();
        ob.display1();
        
        StaticMethod.display2();   //Class name diye access hoi..
    }
    
}
