
package anisul_tuto;


public class DecimalToOthersConversion {
    
    public static void main(String[] args) {
        
        int decimal=15;
        
        String bin=Integer.toBinaryString(decimal);
        String oct=Integer.toOctalString(decimal);
        String hexa=Integer.toHexString(decimal);
        
        System.out.println("bin = "+bin);
        System.out.println("oct = "+oct);
        System.out.println("hexa = "+hexa);
        
        
        String binary = "D";
        /*decimal=Integer.parseInt(binary, 2);
        System.out.println(decimal);
        
        decimal=Integer.parseInt(binary, 8);
        System.out.println(decimal);*/
        
        decimal=Integer.parseInt(binary, 16);
        System.out.println(decimal);
        
        
    }
    
}
