package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Employeeclass {

   String id, name;
   List<JobRole> mList;
   Map<String, List<JobRole>> mMap;

    /*public Employeeclass(String id, String name, List<JobRole> mList) {
        this.id = id;
        this.name = name;
        this.mList = mList;
    }

    public Employeeclass(String id, String name, Map<String, List<JobRole>> mMap) {
        this.id = id;
        this.name = name;
        this.mMap = mMap;
    }
*/
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<JobRole> getmList() {
        return mList;
    }

    public void setmList(List<JobRole> mList) {
        this.mList = mList;
    }

    public Map<String, List<JobRole>> getmMap() {
        return mMap;
    }

    public void setmMap(Map<String, List<JobRole>> mMap) {
        this.mMap = mMap;
    }

    public void showJobRoles(){
        System.out.println("For Employee "+ id + "," + name);
        for (JobRole mObject: mList) {
            System.out.println(mObject.jobId+", "+mObject.jobName+", "+mObject.payScale);
        }
    }

    public void showJobOpenings(){
        for (String name : mMap.keySet()){
            List<JobRole> mListJobRole= mMap.get(name);
            for (JobRole mObject: mListJobRole) {
                System.out.println(mObject.jobId+", "+mObject.jobName+", "+mObject.payScale);
            }
        }

    }
}
