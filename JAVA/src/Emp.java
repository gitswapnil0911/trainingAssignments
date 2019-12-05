public class Emp {
    private int empid;
    String ename;
    String desig;
    Date doj;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) throws InvalidNameException {
        if(ename == null)
            throw new InvalidNameException("Name Cant be blank");
        this.ename=ename;
    }

    public Emp(){}
    public Emp(int empid, String ename, String desig, Date doj) {
        this.empid = empid;
        this.ename = ename;
        this.desig = desig;
        this.doj = doj;
    }

    public void displayEmpDetails() {
        System.out.println("Emp{" +
                "empid=" + empid +
                ", ename='" + ename + '\'' +
                ", desig='" + desig + '\'' +
                ", doj=" + doj +
                '}');
    }

    public static void main(String[] args) {

        //Date d1 = new Date(9,9,1990); //Removing this anonymous abject is created below
        Emp e1 = new Emp(101,"AAA","SSE",new Date(9,11,1990));
        System.out.println(e1.doj.getIntMonth());

    }
}
