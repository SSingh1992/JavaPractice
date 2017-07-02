package com.company.com.collections;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/**
 * Created by ssingh on 6/24/17.
 * Allows an employee to have multiple managers.
 * Using generated @Overriden method hashcode and equals
 * check if same employee not to be added in the manager list.
 */
public class EmployeeTest {
    public static void main(String args[]){
        Map<Integer, List<Employee>> man = new HashMap();
        Manages m = new Manages(man);
        Employee e1 = new Employee(10, "Sanket");
        Employee e2 = new Employee(11, "Amit");
        Employee e3 = new Employee(12, "Piyush");
        Employee e4 = new Employee(10, "Sanket");
        System.out.println(e1+" "+e4);
        //Manager mg = new Manager(1, "Srini");
        m.addOneEmpToManager(1, e1);
        m.addOneEmpToManager(1, e2);
        m.addOneEmpToManager(2, e3);
        m.addOneEmpToManager(1,e3);
        if(!m.addOneEmpToManager(1, e4)){
            System.out.println("Employee not added");
        }

        System.out.println(m.showList());

    }
}
