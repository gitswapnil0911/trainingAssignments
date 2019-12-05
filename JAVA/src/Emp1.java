public class Emp1 {
    int empid=1;
    String ename;
    double sal;
    static int counter=1;

    public Emp1(){
        empid=counter++;
        this.ename="Unknown";
        this.sal=0;
    }
    public Emp1(String ename, double sal) {
        empid=counter++;
        this.ename = ename;
        this.sal = sal;
    }
    public Emp1(String ename) {
        empid=counter++;
        this.ename = ename;
        this.sal=0;
    }

    @Override
    public String toString() {
        return "Emp1{" +
                "empid=" + empid +
                ", ename='" + ename + '\'' +
                ", sal=" + sal +
                '}';
    }

    public static void main(String[] args) {
        Emp1 e1 = new Emp1();
        Emp1 e2 = new Emp1("Sam");
        Emp1 e3 = new Emp1("PAt",5000);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
