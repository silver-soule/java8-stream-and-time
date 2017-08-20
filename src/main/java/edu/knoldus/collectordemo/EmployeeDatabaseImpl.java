package edu.knoldus.collectordemo;

import java.util.ArrayList;

/**
 * Created by Neelaksh on 20/8/17.
 */
class EmployeeDatabaseImpl extends EmployeeDatabase {

    EmployeeDatabaseImpl() {
        listOfEmployee = new ArrayList<>();
    }

    void add(Employee employee) {
        listOfEmployee.add(employee);
    }
}
