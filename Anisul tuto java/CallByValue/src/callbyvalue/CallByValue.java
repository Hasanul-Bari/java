package callbyvalue;

public class CallByValue {
    
    void change(int i){
        System.out.println("i = "+i);
        i=20;
        System.out.println("i = "+i);
    }
    
}
