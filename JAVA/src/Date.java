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

    public void setIntDay(int intDay) throws InvalidDayException{
        if (intDay > 31)
            throw new InvalidDayException("Name Cant be blank");

        this.intDay = intDay;
    }

    public void setIntMonth(int intMonth) throws InvalidMonthException {
        if (intMonth > 12)
            throw new InvalidMonthException("Month Cant be blank");
            this.intMonth = intMonth;

    }

    public void setIntYear(int intYear) throws InvalidYearException {
        if (intYear < 1984)
            throw new InvalidYearException("Month Cant be blank");
            this.intYear = intYear;
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