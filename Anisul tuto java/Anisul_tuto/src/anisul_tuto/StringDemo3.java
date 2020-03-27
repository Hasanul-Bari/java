
package anisul_tuto;

public class StringDemo3 {
    
    public static void main(String[] args) {
        
        String country="Bangladesh is my country";
        System.out.println(country);
        
        char c=country.charAt(5);
        
        System.out.println(c);
        
        int value=country.codePointAt(0);
        System.out.println(value);
        
        int pos=country.indexOf("is");
        System.out.println("pos = "+pos);
        
        pos=country.lastIndexOf('n');
        System.out.println("pos = "+pos);
        
        String s1="   Bangladesh is my country    ";
        System.out.println(s1.trim());
        
        
        
        
        
    }
    
    
    
    
}
