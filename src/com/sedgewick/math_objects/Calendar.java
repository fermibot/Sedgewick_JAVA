package com.sedgewick.math_objects;

public class Calendar {

    public static String DayOfTheWeek(int y, int m, int d) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return days[d0 - 1];
    }

    public static void main(String[] args) {
        System.out.println(DayOfTheWeek(2000, 02, 14));
    }
}
