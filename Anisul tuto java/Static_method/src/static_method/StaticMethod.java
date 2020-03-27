package static_method;

public class StaticMethod {
    
    int x=30;
    static int y=20;
    
    void display1(){
        System.out.println("This is not a static method");
    }
    
    static void display2(){
       // display1();     //non static member access krte parbe na
       
        //System.out.println("x= "+x);   //non static member access krte parbe na  
        System.out.println("y= "+y);    // static member access krte parbe 
        System.out.println("This is a static method");
    }
    
}
