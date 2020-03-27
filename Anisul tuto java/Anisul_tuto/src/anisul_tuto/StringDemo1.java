
package anisul_tuto;


public class StringDemo1 {
    
    public static void main(String[] args) {
        
        String s1="Hasanul Bari";
        String s2=new String("Hasanul bari");
        String s4=s1;
        
        
        char[] s3={'H','a','s','a','n'};
        System.out.println(s3);
        
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);
        
        System.out.println("s1.length() = "+s1.length());
        
        if(s1==s2)
        {
            System.out.println("Equal");
        }
        else
            System.out.println("Not equal");
        
        if(s1.equals(s2))
            System.out.println("Equal");
        else
            System.out.println("Not equal");
        
        if(s1.equalsIgnoreCase(s2))
            System.out.println("Equal");
        else
            System.out.println("Not equal");
        
        if(s1.contains("Hasan"))
            System.out.println("contain");
        else
            System.out.println("Not contain");
    }
    
}
