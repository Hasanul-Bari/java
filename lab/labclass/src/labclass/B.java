package labclass;


public class B extends A {
    
  
    @Override
    int add (int x,int y){
        System.out.println("Class B add(int)");
        return x+y;
    }
    @Override
    String add (String x, String y){
        System.out.println("Class B add(String)");
        return x+y;
    }
    
}
