package com.jpm.moduleassesment;

public class Date {
    int intDay;
    int intMonth;
    int intYear;

    public int getIntDay() {
        return intDay;
    }

    public int getIntMonth() {
        return intMonth;
    }

    public int getIntYear() {
        return intYear;
    }

    public Date() {

    }

    public Date(int intDay, int intMonth, int intYear) {
        this.intDay = intDay;
        this.intMonth = intMonth;
        this.intYear = intYear;
    }

    @Override
    public String toString() {
        return "Day is : " + intDay + "Month : " + intMonth + "Year is : " + intYear;
    }

   /* public void displayDate() {
        System.out.println("Day is : " + intDay + "Month : " + intMonth + "Year is : " + intYear);
    }
*/

}