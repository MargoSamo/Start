package org.margo.start.calendar;

import java.util.*;

import static java.lang.System.out;

public class FullMoons {

    static int DAY_IM = 1000 * 60 * 60 * 24;

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2022,6,13,18,34);
        long day1 = c.getTimeInMillis();
        for (int x = 1; x < 10; x++) {
            day1 += (DAY_IM * 29.2);
                    c.setTimeInMillis(day1);
            out.println(String.format("full moon on %tc", c));
        }
    }
}
