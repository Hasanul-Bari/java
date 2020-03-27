package final_keyword;


final public class University {
    
    final String name="HSTU";
    final int fees;
    final static int rank;
    
    University(){
        fees=500;
    }
    static{
        rank=5;
    }
    
            
    
    final void display(){
        System.out.println("University Info");
        System.out.println("Name : "+name);
        System.out.println("fees : "+fees);
        System.out.println("Rank : "+rank);
    }
    
}
