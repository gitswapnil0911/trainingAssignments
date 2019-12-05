public class WageEmp extends Emp {
    private int hrs, rate;
    public WageEmp(){}

    public WageEmp(int hrs, int rate) {
        this.hrs = hrs;
        this.rate = rate;
    }

    public WageEmp(int empid, String ename, String desig, Date doj, int hrs, int rate) {
        super(empid, ename, desig, doj);
        this.hrs = hrs;
        this.rate = rate;
    }

    public int calcSal(){
        return hrs*rate;
    }

    public void displayEmpDetails() {
        System.out.println("Salary is calculated in Wages");
    }

    public static void main(String[] args) {
        WageEmp we1=new WageEmp(102,"BBB","SSE",new Date(9,12,1994),10,5000);
        we1.displayEmpDetails();
        System.out.println("Salary is "+we1.calcSal());
    }
}
