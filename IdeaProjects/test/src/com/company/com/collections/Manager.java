package com.company.com.collections;

/**
 * Created by ssingh on 6/24/17.
 */
public class Manager {

    private Integer managerId;
    private String managerName;

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public Manager(){
    }

    public Manager(int managerId, String managerName){
        this.managerId = managerId;
        this.managerName = managerName;
    }
}
