package com.russ.maxuewen.test;

import java.time.Clock;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Created by MaXuewen on 2017/9/5.
 */
public class Time {

  public static void main(String[] args) {
    System.out.println(Clock.systemUTC().millis());
    System.out.println(System.currentTimeMillis());

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    Locale locale = dateTimeFormatter.getLocale();
    System.out.println(locale.toString());
  }
}
