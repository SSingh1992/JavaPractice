package com.company.com.collections;

/**
 * Created by ssingh on 6/24/17.
 */
public class Employee {
    private Integer empId;
    private String empName;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Employee(){
    }

    public Employee(int empId, String empName){
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (!empId.equals(employee.empId)) return false;
        return empName.equals(employee.empName);
    }

    @Override
    public int hashCode() {
        int result = empId.hashCode();
        result = 31 * result + empName.hashCode();
        return result;
    }
        @Override
    public String toString(){
        return empName+" :: "+empId;
    }
}
