package edu.knoldus.collectordemo;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by Neelaksh on 21/8/17.
 */
class EmployeeService {

    EmployeeDatabase employeeDatabase;

    EmployeeService(EmployeeDatabase employeeDatabase) {
        this.employeeDatabase = employeeDatabase;
    }

    public Map<String, Double> getAverageSalaryByDepartment() {
        Collector<Employee, ?, Double> averagingSalaries
                = Collectors.averagingInt(Employee::getSalary);
        return employeeDatabase.getListOfEmployee().stream().collect(Collectors.groupingBy(Employee::getDepartment, averagingSalaries));
    }

    public Map<String, Long> getEmployeeCountByDepartment() {
        return employeeDatabase.getListOfEmployee().stream().collect(
                Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
    }

    public Optional<Employee> getEmployeeWithMaxSalary() {
        return employeeDatabase.getListOfEmployee().stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
    }

    public Optional<Employee> getEmployeeWithMinSalary() {
        return employeeDatabase.getListOfEmployee().stream()
                .collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
    }

    public Map<Boolean, List<Employee>> splitemployessByAge(int splitAge) {
        return employeeDatabase.getListOfEmployee().stream().collect(Collectors.partitioningBy(emp -> emp.getAge() > splitAge));
    }

    public double getAverageAgeInPayBracket(int earnsAbove){
        return employeeDatabase.getListOfEmployee().parallelStream()
                .filter(employee -> employee.salary>earnsAbove)
                .collect(Collectors.averagingInt(Employee::getAge));
    }
}
