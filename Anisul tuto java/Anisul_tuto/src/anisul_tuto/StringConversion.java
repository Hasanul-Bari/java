package anisul_tuto;

public class StringConversion {
    
    public static void main(String[] args) {
        
        //primitive to string
        
        int i=30;
        String s=Integer.toString(i);
        System.out.println("s= "+s);
        
       double d=20.5;
       s=Double.toString(d);
        System.out.println("s = "+s);
        
       boolean b=true;
       s=Boolean.toString(b);
        System.out.println("s = "+s);
        
        
        //String to primitive
        
        String str="32";
        i=Integer.parseInt(str);
        System.out.println("i= "+i);
        
        d=Double.parseDouble(str);
        System.out.println("d = "+d);
        
        b=Boolean.parseBoolean(str);
        System.out.println("b= "+b);
        
        
        //22
        System.out.println("----------");
        String str1="65";
        i=Integer.valueOf(str1);
        System.out.println("i= "+i);
        
        d=Double.valueOf(str1);
        System.out.println("d = "+d);
        
        b=Boolean.valueOf(str1);
        System.out.println("b= "+b);
    }
    
}
