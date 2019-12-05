import java.util.Arrays;

public class Student {
    int stid;
    String name;
    int cls;
    char div;
    char grade;
    int[] marks;
    int sum=0;
    int perc=0;

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public int getPerc() {
        return perc;
    }

    public void setPerc(int perc) {
        this.perc = perc;
    }

    public void percentage(int[] arr) {


        for (int i : arr) {
            sum += i;
        }
        setPerc((sum/5));
        System.out.println(perc);
    }

    public void getGrd() {
        if(perc>=80){
            setGrade('A');
        }
        else if(perc>=70){
            setGrade('B');
        }
        else if(perc>=60){
            setGrade('C');
        }
        else if(perc>=50){
            setGrade('D');
        }
        else
            setGrade('F');
    }

    public Student(){}

    public Student(int stid, String name, int cls, char div, int[] marks) {
        this.stid = stid;
        this.name = name;
        this.cls = cls;
        this.div = div;
        this.marks = marks;
    }



    public void displayStudent() {
        System.out.println("Student stid=" + stid + " name" + name + " class is " + cls + " Div is " + div + " Grade is " + getGrade() + " Perc is " +perc+
                "marks=" + Arrays.toString(marks));    }
}
