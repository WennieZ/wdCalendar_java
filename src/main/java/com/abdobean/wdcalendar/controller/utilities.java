/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abdobean.wdcalendar.controller;

import java.util.Calendar;
import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author abdo.talaat
 */
public class utilities {

    public static String[] getWeekRange(String date) {

        String[] dateTimes = new String[2];
        DateTimeFormatter formatter = DateTimeFormat.forPattern("MM/dd/yyyy");
        DateTime dt = formatter.parseDateTime(date);
        DateTime weekStart = dt.withDayOfWeek(DateTimeConstants.MONDAY).withTimeAtStartOfDay();
        DateTime weekEnd = dt.withDayOfWeek(DateTimeConstants.SUNDAY).plusDays(1).withTimeAtStartOfDay();

        dateTimes[0] = weekStart.toString(formatter);
        dateTimes[1] = weekEnd.toString(formatter);
        System.out.println("now: " + dt);
        System.out.println("weekStart: " + weekStart);
        System.out.println("weekEnd: " + weekEnd);
        return dateTimes;
    }

    public static String[] getmonthRange(String date) {

        String[] dateTimes = new String[2];
        DateTimeFormatter formatter = DateTimeFormat.forPattern("MM/dd/yyyy");
        DateTime dt = formatter.parseDateTime(date);
        DateTime start = dt.withDayOfMonth(1).withTimeAtStartOfDay();
        DateTime end = start.plusMonths(1).minusMillis(1);
        dateTimes[0] = start.toString(formatter);
        dateTimes[1] = end.toString(formatter);
        System.out.println("now: " + dt);
        System.out.println("weekStart: " + start);
        System.out.println("weekEnd: " + end);
        return dateTimes;
    }

    public static String[] getDayRange(String date) {

        String[] dateTimes = new String[2];
        DateTimeFormatter formatter = DateTimeFormat.forPattern("MM/dd/yyyy");
        DateTime dt = formatter.parseDateTime(date);
        DateTime start = dt.withTimeAtStartOfDay();
        DateTime end = start.plusDays(1);
        dateTimes[0] = start.toString(formatter);
        dateTimes[1] = end.toString(formatter);
        System.out.println("now: " + dt);
        System.out.println("weekStart: " + start);
        System.out.println("weekEnd: " + end);
        return dateTimes;
    }

    public static DateTime getdateDateTime(String date) {
        final DateTimeFormatter dtf = DateTimeFormat.forPattern("MM/dd/yyyy HH:mm");
        DateTime dt = dtf.parseDateTime(date);
        return dt;
    }
}
