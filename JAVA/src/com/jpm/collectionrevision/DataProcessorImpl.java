package com.jpm.collectionrevision;

import java.time.LocalDate;

public class DataProcessorImpl {


    public static Boolean process(Passport passport) {
        LocalDate date = passport.getExpiryDate();
        LocalDate myDate = LocalDate.of(2030, 12, 31);
        return passport.getExpiryDate().isBefore(myDate);
    }

    public Boolean process1(Passport passport) {
        LocalDate date = passport.getExpiryDate();
        LocalDate myDate = LocalDate.of(2030, 12, 31);
        return passport.getExpiryDate().isAfter(myDate);
    }
}
