package callbyreference;


public class Test {
    
    public static void main(String[] args) {
        
        CallByReference r1=new CallByReference();
        
        r1.name="Hasan";
        System.out.println("r1.name = "+r1.name);
        
        r1.change(r1);
        
        System.out.println("r1.name = "+r1.name);
        
        
        
    }
    
}
