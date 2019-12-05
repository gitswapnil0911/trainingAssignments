public class SalesEmp extends WageEmp {
    int comission;
    public SalesEmp(){}

    public SalesEmp(int comission) {
        this.comission = comission;
    }

    public SalesEmp(int hrs, int rate, int comission) {
        super(hrs, rate);
        this.comission = comission;
    }

    public SalesEmp(int empid, String ename, String desig, Date doj, int hrs, int rate, int comission) {
        super(empid, ename, desig, doj, hrs, rate);
        this.comission = comission;
    }

    public int calcSal(){
        return super.calcSal() + comission;
    }

    public void displayEmpDetails() {
        System.out.println("Salary is calculated in Sales employee is "+calcSal());
    }

    public static void main(String[] args) {
        SalesEmp se1=new SalesEmp(102,"BBB","SSE",new Date(9,12,1994),10,5000,1000);
        se1.displayEmpDetails();
        System.out.println("Salary is "+se1.calcSal());
    }
}
