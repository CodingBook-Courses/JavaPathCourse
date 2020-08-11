package com.company;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(0, 0, 0);
    }
    public Time(int hour) {
        this(hour, 0, 0);
    }
    public Time(int hour, int minute) {
        this(hour, minute, 0);
    }
    public Time(Time time) {
        this(time.hour, time.minute, time.second);
    }
    public Time(int hour, int minute, int second) {
        if((hour >= 0 && hour < 24) && (minute >= 0 && minute < 60) && (second >= 0 && second < 60)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
    }

    public void setHour(int hour) {
        if(hour >= 0 && hour < 23) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
    }

    public void setMinute(int minute) {
        if(minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
    }

    public void setSecond(int second) {
        if(second >= 0 && second < 60) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String toString() {
        String time;
        time = String.format("%02d:%02d:%02d %s", ((this.getHour() == 0 || this.getHour() == 12) ? 12 : this.getHour() % 12),
                this.getMinute(), this.getSecond(), (this.getHour() < 12 ? "AM" : "PM"));
        return time;
    }

//    public String toString() {
//        String time;
//        if(this.getHour() == 0 || this.getHour() == 12) {
//            time = "12";
//        } else {
//            time = "" + this.getHour() % 12;  //22 % 12
//        }
//
//        time += ":" + this.getMinute() + ":" + this.getSecond();
//
//        if(this.getHour() < 12) {
//            time += " AM";
//        } else {
//            time += " PM";
//        }
//
//        return time;   //5:10:19 AM    // 0 to 23 hours
//                                        // 12 Am to 12 PM to 12 AM
//    }
}
