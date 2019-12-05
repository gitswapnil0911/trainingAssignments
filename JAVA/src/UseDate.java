public class UseDate {
    public static void main(String[] args){
        Date d1 = new Date(11, 2, 2019);
        //System.out.println(d1);
        try {
            d1.setIntDay(100);
        } catch (InvalidDayException e) {
            System.out.println(e.getMessage());
        }
        try {
            d1.setIntMonth(13);
        } catch (InvalidMonthException e) {
            System.out.println(e.getMessage());
        }
        try {
            d1.setIntYear(1983);
        } catch (InvalidYearException e) {
            System.out.println(e.getMessage());
        }
    }
}
