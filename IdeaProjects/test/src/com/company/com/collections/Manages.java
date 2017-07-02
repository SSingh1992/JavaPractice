package com.company.com.collections;

import java.util.*;

/**
 * Created by ssingh on 6/24/17.
 */
public class Manages {
    private int managerId;
    private Map<Integer, List<Employee>> manages;
    List<Employee> empList;

    public Manages(){

    }
    public Manages(Map<Integer, List<Employee>> manages){
        this.manages = manages;
    }

    public Boolean addOneEmpToManager(Integer mId, Employee eId){
        if (manages.containsKey(mId) ){
            //If manager exists in the map : key
            empList = manages.get(mId);
            if(empList.contains(eId)){
                return false;
            }else{
                empList.contains(eId);
                //System.out.println(empList.toString());
                empList.add(eId);
                manages.put(mId, empList);
                return true;
            }

        }else{
            //If Manager Key does not exits
            List<Employee> newEmpList = new ArrayList<>();
            newEmpList.add(eId);
            manages.put(mId, newEmpList);
            return true;
        }
    }

    public Map showList(){
        return manages;
    }
}
