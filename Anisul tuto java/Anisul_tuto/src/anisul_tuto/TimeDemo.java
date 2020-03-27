package anisul_tuto;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class TimeDemo {
    
    public static void main(String[] args) {
        
        LocalTime t=LocalTime.now();
        System.out.println("t= "+t);
        
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("hh::mm::ss");
        String ct=t.format(dtf);
        System.out.println("ct= "+ct);
    }
    
}
