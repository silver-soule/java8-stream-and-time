package edu.knoldus.collectordemo;

import java.util.List;

/**
 * Created by Neelaksh on 21/8/17.
 */
abstract class EmployeeDatabase {
    List<Employee> listOfEmployee;

    abstract void add(Employee employee);

    public List<Employee> getListOfEmployee() {
        return listOfEmployee;
    }
}
