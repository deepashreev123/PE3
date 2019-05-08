package com.stackroute;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calender {
    public static void main(String []args){
        // Get calendar set to current date and time
        Calendar calender = Calendar.getInstance();

        // Set the calendar to TUESDAY of the current week
        calender.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        System.out.println();
        // Print dates of the current week starting on TUESDAY
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(df.format(calender.getTime()));
        for (int i = 0; i <6; i++) {
            calender.add(Calendar.DATE, 1);
        }
        System.out.println(df.format(calender.getTime()));
        System.out.println();
    }
}