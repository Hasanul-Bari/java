
package anisul_tuto;


public class StringDemo2 {
    
    public static void main(String[] args) {
        
        String s1="Hasanul", s2="Bari";
        
        String s3=s1+s2;
        String s4=s1.concat(s2);
        
        System.out.println("S3 = "+s3);
        System.out.println("S4 = "+s4);
        
        System.out.println("s3.toUpperCase() = "+s3.toUpperCase());
        System.out.println("s4.toLowerCase() = "+s4.toLowerCase());
        
        boolean b= s1.startsWith("Hasanul");
        System.out.println(b);
        
        b=s3.endsWith(s4);
        System.out.println(b);
        
        
        
    }
    
}
