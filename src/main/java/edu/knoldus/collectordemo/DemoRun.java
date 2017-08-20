package edu.knoldus.collectordemo;

/**
 * Created by Neelaksh on 21/8/17.
 */
public class DemoRun {
    public static void main(String[] args) {
        EmployeeDatabase employeeDatabaseImpl = new EmployeeDatabaseImpl();
        Employee emp1 = new Employee(1,"Neelaksh","A",15000,21);
        Employee emp2 = new Employee(2,"Suryansh","B",10000,20);
        Employee emp3 = new Employee(3,"abcde","A",40000,23);
        employeeDatabaseImpl.add(emp1);
        employeeDatabaseImpl.add(emp2);
        employeeDatabaseImpl.add(emp3);
        EmployeeService employeeService = new EmployeeService(employeeDatabaseImpl);
        System.out.println(employeeService.getEmployeeWithMinSalary());
    }
}
