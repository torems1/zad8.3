package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Date date=new Date();
        Calendar calendar1=new GregorianCalendar();
        System.out.println("Enter year: ");
        int year=sc.nextInt();
        System.out.println("Enter month: ");
        int month= sc.nextInt();
        System.out.println("Enter day: ");
        int day= sc.nextInt();
        System.out.println("Enter hours: ");
        int hours= sc.nextInt();
        System.out.println("Enter minutes: ");
        int minutes=sc.nextInt();
        calendar1.set(year,month,day,hours,minutes);
        System.out.println("Calender current date: "+calendar1.getTime());
        date=calendar1.getTime();
        System.out.println("Calendar current date: "+date);
    }
}
