package Exception;

public class ExceptionDemo1 {

    public static void main(String[] args) {

        try {
            
            /*int x = 10;
            int y = 0;
            int result = x / y;

            System.out.println("Result = " + result);*/
            
            int []a=new int[4];
            a[5]=120;
            
        }
        catch(Exception e){
            System.out.println(e);
        }
            
        
        finally{
            System.out.println("End of program");
        }

        
    }

}
