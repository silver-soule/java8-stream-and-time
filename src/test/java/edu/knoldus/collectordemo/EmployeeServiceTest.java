package edu.knoldus.collectordemo;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Neelaksh on 21/8/17.
 */
public class EmployeeServiceTest {

    static EmployeeDatabase employeeDatabaseImpl = new EmployeeDatabaseImpl();
    EmployeeService employeeService = new EmployeeService(employeeDatabaseImpl);

    @BeforeClass
    public static void setUp() throws Exception {
        Employee emp1 = new Employee(1,"Neelaksh","A",15000,21);
        Employee emp2 = new Employee(2,"Suryansh","B",10000,20);
        Employee emp3 = new Employee(3,"abcde","A",40000,23);
        employeeDatabaseImpl.add(emp1);
        employeeDatabaseImpl.add(emp2);
        employeeDatabaseImpl.add(emp3);
    }


    @Test
    public void getAverageSalaryByDepartment() throws Exception {
        assertEquals(employeeService.getAverageSalaryByDepartment().get("B"),10000,0.0001);
    }

    @Test
    public void getEmployeeCountByDepartmentTest() throws Exception {
        assertEquals(employeeService.getEmployeeCountByDepartment().get("A"),2,0.00001);
    }

    @Test
    public void getEmployeeWithMaxSalaryTest() throws Exception {
        assertEquals(employeeService.getEmployeeWithMaxSalary().get().id,3);
    }

    @Test
    public void getEmployeeWithMinSalaryTest() throws Exception {
        assertEquals(employeeService.getEmployeeWithMinSalary().get().id,2);
    }

    @Test
    public void splitemployessByAgeTest() throws Exception {
        assertEquals(employeeService.splitemployessByAge(21).get(false).size(),2);
    }

    @Test
    public void getAverageAgeInPayBracket() throws Exception {
        assertEquals(employeeService.getAverageAgeInPayBracket(13000),22,0.001);
    }

}
