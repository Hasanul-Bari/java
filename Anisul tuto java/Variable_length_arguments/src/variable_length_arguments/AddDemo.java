package variable_length_arguments;

public class AddDemo {
    
    void add(int ... num){
        
        int sum=0; 
        for(int x : num){
            sum=sum+x;
        }
        
        System.out.println("Sum= "+sum);
    }
    
}
