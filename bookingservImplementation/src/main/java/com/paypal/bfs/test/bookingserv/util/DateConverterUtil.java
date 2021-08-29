package com.paypal.bfs.test.bookingserv.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverterUtil {
    private static DateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");

    public static String convertDate(Date date) {
        return dateFormatter.format(date);
    }

    public static Date convertToDate(String date) throws ParseException {
        return dateFormatter.parse(date);
    }
}
