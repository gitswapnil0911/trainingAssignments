package com.jpm.moduleassesment;

public class ManageEmp {
    public static void main(String[] args) {
        EmpOperations eo = new EmpOperations();
        try {
            eo.addEmployee(new Employee(1, "Swapnil", 500, new Date(11, 2, 2019)));
            eo.addEmployee(new Employee(2, "Pat", 501, new Date(11, 2, 2019)));
            eo.addEmployee(new Employee(3, "Sandy", 502, new Date(11, 2, 2019)));
            eo.addEmployee(new Employee(4, "Mang", 503, new Date(11, 2, 2019)));
            eo.addEmployee(new Employee(5, "Praylo", 504, new Date(11, 2, 2019)));
        } catch (InvalidEmployeeName invalidEmployeeName) {
            invalidEmployeeName.getMessage();
        }

        //eo.displayAllEmpDetails(); //Woeking
        System.out.println(eo.searchEmpById(5)); //Working
        //eo.deleteEmp(5);//Working
        //eo.displayAllEmpDetails();
        //System.out.println(eo.getEmpNames());

        Programmer p[] = new Programmer[2];
        try {
            p[0] = new Programmer(1, "Sam", 500, new Date(1, 12, 2019), new String[]{"Java", "PHP", "Servlet"});
            p[1] = new Programmer(2, "Paty", 5000, new Date(1, 11, 2019), new String[]{"Java", "Servlet"});
        } catch (InvalidEmployeeName invalidEmployeeName) {
            invalidEmployeeName.getMessage();
        }
        for (Programmer i : p) {
            i.displayDetail();
        }
    }
}
