package super_keyword;


public class B extends A {
    B(){
        super();
        System.out.println("B's constructor");
    }
    int x=5;
    
    void display(){
        
        System.out.println("x ="+x);
        System.out.println("x ="+super.x);
    }
    
    @Override
    void message(){
        super.message();
        System.out.println("Inside class B");
    }
            
            
}
