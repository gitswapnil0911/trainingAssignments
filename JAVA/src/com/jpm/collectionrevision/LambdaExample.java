package com.jpm.collectionrevision;

import org.mockito.cglib.core.Local;

import java.time.LocalDate;

public class LambdaExample {
    public static void main(String[] args) {
        Passport p1 = new Passport("P01","Sanil", LocalDate.of(2019, 5 , 24));
        Datastore<Passport, String> passportData = new PassportDataStore();
        passportData.add(p1);
        LocalDate myDate=LocalDate.of(2030, 12, 31);
        DataProcessor<Passport, Boolean> expDateCheck= //Interface refrence
                (ppt) -> ppt.getExpiryDate().isBefore(myDate);//lambda expression actual logic for processData method

        Boolean isBefore = expDateCheck.processData(p1);
        System.out.println(isBefore);

        /*DataProcessorImpl di = new DataProcessorImpl(); //Normal implementation without Lambda
        Boolean check = di.processData(p1);
        System.out.println(check);
*/
        DataProcessor<Passport, Boolean> expDateCheck1= //Using Lambda Block
                (ppt) -> {
                    LocalDate date= ppt.getExpiryDate();
                    Boolean isBefore1= date.isBefore(LocalDate.of(2030, 12,30));//lambda expression actual logic for processData method
                    return isBefore1;
                };
        Boolean isBefore1=expDateCheck1.processData(p1);
        System.out.println(isBefore1);

        DataProcessor<Passport, Boolean> expDateBeforecheck= DataProcessorImpl::process;//Method refrencing using static method with same signature in another class without implmenting interface
        Boolean isBefore2=expDateBeforecheck.processData(p1);
        System.out.println(isBefore2);

        DataProcessor<Passport, Boolean> expDateAftercheck= new DataProcessorImpl()::process1;//Method refrencing using non-static method with same signature in another class without implmenting interface
        Boolean isAfter=expDateAftercheck.processData(p1);
        System.out.println(isAfter);

    }
}
