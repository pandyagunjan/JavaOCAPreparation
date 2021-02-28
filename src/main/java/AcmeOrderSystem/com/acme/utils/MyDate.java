package AcmeOrderSystem.com.acme.utils;

import java.util.Objects;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
        this(1,1,1900);
    }

    {
        this.day = 01;
        this.month = 01;
        this.year = 2000;
    }

    public MyDate(int m, int d, int y) {
        this.month = m;
        this.day = d;
        this.year = y;

    }

    @Override
    public String toString() {

        return day + "/" + month + "/" + year;
//        return "MyDate{" +
//                "day=" + day +
//                ", month=" + month +
//                ", year=" + year +
//                '}';
    }


    public void setDate(int m, int d, int y) {
        this.month = m;
        this.day = d;
        this.year = y;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (valid(day, month, year)) {
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private boolean valid(int day, int month, int year) {
        if (day > 31 || day < 1 || month > 12 || month < 1) {
            System.out.println("Attempting  to create a non-valid date "
                    + month + "/" + day + "/" + year);
            return false;
        }
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return (day <= 30);
            case 2:
            return day <= 28 || (day == 29 && year % 4 == 0);
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return day == myDate.day && month == myDate.month && year == myDate.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}