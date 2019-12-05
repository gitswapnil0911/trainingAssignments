public class UseEmp {
    public static void main(String[] args) throws InvalidNameException {
        Emp eob[] = new Emp[3];
        eob[0]= new Emp(101,"AAA","SSE",new Date(9,11,1990));
        eob[1]= new WageEmp(102,"BBB","SSE",new Date(9,12,1994),10,5000);
        eob[2]= new SalesEmp(103,"CCC","SSE2",new Date(9,12,2000),10,6000,2000);
        for (Emp sal:eob){
            //sal.displayEmpDetails();
            if (sal instanceof SalesEmp) {
                System.out.println(((SalesEmp) sal).calcSal());
            }
             else if (sal instanceof WageEmp){
                System.out.println(((WageEmp) sal).calcSal());
            }
            else
                System.out.println("Salary NA");

        }
        Emp e1=new Emp();
        e1.setEname("");
    }

}
