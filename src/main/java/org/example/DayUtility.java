package org.example;

import com.google.common.annotations.VisibleForTesting;

import java.time.LocalDate;

public class DayUtility
{
    public DayUtility() {}

    private LocalDate localDate = LocalDate.now();

    private int getDayFromToday()
    {
        int day = getCurrentDay().getDayOfWeek().getValue();
        //System.out.println(day);
        return day;
    }

    @VisibleForTesting
    public LocalDate getCurrentDay()
    {
        return localDate.now();
    }

    //    @VisibleForTesting
//    public void setLocalDate(LocalDate localDate)
//    {
//        this.localDate = localDate;
//    }
    public boolean isDayOff()
    {
        return getDayFromToday() < 6;
    }

    public static void main(String[] args)
    {
        DayUtility main = new DayUtility();
        main.getDayFromToday();
    }
}
