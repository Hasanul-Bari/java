package anisul_tuto;

public class ForEachLoop {
    
    public static void main(String[] args) {
        
        String [] str= {"hasan", "hp", "hp7", "hb"};
        System.out.println(str.length);
        
        for(String x : str)
        {
            System.out.println(x);
        }
        
        int [] arr={10,20,30,40,50,60,70,80,90,100};
        int sum=0;
        for(int x : arr){
            sum=sum+x;
        }
        System.out.println("sum = "+sum);
    }
    
}
