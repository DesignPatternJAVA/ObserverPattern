package observer.CalenderSample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Logger;

/**
 * Created by soham on 19/4/16.
 */
public class CalenderSample {
    public static void main(String [] args){
        System.out.println("Working...");
        int j=0;
        String key;
        String startDate,endDate;
        Calendar mCalendar = new GregorianCalendar();
        int maxHour = mCalendar.get(Calendar.HOUR_OF_DAY);
        System.out.println("Max Hour "+maxHour);
        for (int i = 0; i < 24; i++) {
            if(i<18){
                j=i+6;
            }else{
                j+=1;
            }
            if (j < 10) {
                key = "0" + j + ":00";
                System.out.println("Key "+key);
            } else {
                key = j + ":00";
                System.out.println("Key "+key);
            }
            if(i==18){
                j=0;
               // System.out.println("0000000");
            }
            if (i == 0) {
               // System.out.println("06am");
            } else if (i == 12) {
               // System.out.println("06pm");
            } else if (i == 24) {
                //System.out.println("06am");
            } else {}

        }
    }
}
