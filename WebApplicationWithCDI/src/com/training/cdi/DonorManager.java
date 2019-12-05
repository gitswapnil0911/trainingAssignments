package com.training.cdi;




import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class DonorManager {

    @Inject
    @QualifiedBank(type = BankType.BloodBank)
    private Bank bloodBank;


    @Inject
    @Any
    private Instance<Bank> donorList;

    public String[] getBloodDonors(){
        return bloodBank.topDonors();
    }

    public String[] getAllDonors(){
        List<String> masterList = new ArrayList<>();

        for(Bank eachInstance:donorList){

            for(String eachDonor : eachInstance.topDonors()){
                masterList.add(eachDonor);
            }
        }

        return masterList.toArray(new String[0]);

    }

}
