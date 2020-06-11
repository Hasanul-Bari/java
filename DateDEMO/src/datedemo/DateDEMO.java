/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datedemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Hasan
 */
public class DateDEMO {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) 
	{
		          String s= getNextDate("2021/02/26");
                          
                           System.out.println(s);
                          
                          /*s=getNextDate(s);
                          
                          System.out.println(s);
                          
                          s=getNextDate(s);
                          
                          System.out.println(s);*/
	}
    
    public static String getNextDate(String curDate) {
        String nextDate = "";
        try {
            Calendar today = Calendar.getInstance();
            DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
            Date date = format.parse(curDate);
            today.setTime(date);
            today.add(Calendar.DAY_OF_YEAR, 3);
            nextDate = format.format(today.getTime());
        } catch (Exception e) {
            return nextDate;
        }
        return nextDate;
    }
    
}
