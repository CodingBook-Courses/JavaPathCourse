package com.company;

public class TimeMain {
    public static void main(String[] args) {
        Time time = new Time(22, 10, 19);
        Time time1 = new Time(4, 12);
        Time time2 = new Time(time);
        Time time3 = new Time(23);
        Time time4 = new Time();
        Time time5 = new Time(11, 45, 58);

        System.out.println(time);
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
        System.out.println(time4);
        System.out.println(time5);

    }
}
