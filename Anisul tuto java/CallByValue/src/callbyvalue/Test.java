package callbyvalue;


public class Test {
    
    public static void main(String[] args) {
        
        CallByValue ob=new CallByValue();
        int x=10;
        System.out.println("x= "+x);
        ob.change(x);
        System.out.println("x= "+x);
    }
    
}
