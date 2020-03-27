package static_block;

public class StaticBlock {
    
    static int id;
    static String name;
    
    static{
        System.out.println("StaticBlock");
        id=100;
        name="Hasan";
    }
    
    static void display(){
            System.out.println("id = "+id);
            System.out.println("name = "+name);
    }
    
    
    public static void main(String[] args) {
        System.out.println("Main Block");// main block ar age static block kaj korbe..
    }
    
}
