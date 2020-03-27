package anisul_tuto;

public class StringBufferDemo {
    
    public static void main(String[] args) {
        
        StringBuffer sb=new StringBuffer("Hasanhp");
        
        System.out.println(sb);
        
        sb.append("hp");
        sb.append(7);
        System.out.println(sb);
        
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        
        System.out.println(sb);
        sb.delete(5,7);   //(5.5+2) 5 ar pore 2 ta char delete krbe..
        System.out.println(sb);
        
        
        sb.setLength(5);
        System.out.println(sb);
        
        String s2=sb.toString();
        System.out.println(s2);
    }
    
}
