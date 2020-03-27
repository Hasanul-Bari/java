package anisul_tuto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateDemo {
    
    public static void main(String[] args) {
        
        Date d=new Date();
        System.out.println("d= "+d);
        
        DateFormat df=new SimpleDateFormat("dd/MM/YYYY");
        String cd=df.format(d);
        System.out.println("cd= "+cd);
    }
}
