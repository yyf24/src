package com.fistday;

import javafx.scene.chart.XYChart;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;
import java.util.Date;

public class data {
    public static void main(String[] args) throws ParseException {
        Date date =new Date();
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format =sdf.format(date);
        System.out.println(format);
        Date d =sdf.parse("2023年08月24日 11:32:27 星期四");
        System.out.println(d);

        Calendar cld =Calendar.getInstance();
        System.out.println(cld);
        System.out.println(cld.get(Calendar.MONDAY));
        LocalDateTime ldt =LocalDateTime.now();
        System.out.println(ldt);
        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        System.out.println(dtf.format(ldt));
    }
}
