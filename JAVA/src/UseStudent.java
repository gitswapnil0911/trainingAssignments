public class UseStudent {
    public static void main(String[] args) {
        int[] arr={60,60,60,60,60};
        int perc;
        Student s1= new Student(1,"Sam",5,'A',arr);
        s1.percentage(arr);
        s1.getGrd();
        s1.displayStudent();

    }
}
