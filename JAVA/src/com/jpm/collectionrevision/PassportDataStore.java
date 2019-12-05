package com.jpm.collectionrevision;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PassportDataStore implements Datastore<Passport, String> {
    private static Map<String, Passport> passports;
    static {
        passports= new HashMap<>();
    }
    public PassportDataStore() {

    }

    @Override
    public void add(Passport passport) {
        String passportNo=passport.getPassportNo();
        passports.put(passportNo, passport);
    }

    @Override
    public Passport getById(String passportNo) {
        Passport passport=passports.get(passportNo);
        return passport;
    }

    @Override
    public Collection<Passport> getAll() {
        Collection<Passport> allPassports=passports.values();
        return allPassports;
    }
}
