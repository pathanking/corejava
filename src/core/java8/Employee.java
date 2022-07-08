package core.java8;

import core.oop.Emp;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public record Employee(Integer empId, String empName, String dept, String status, Integer salary) {
}

class StreamDemo2{
    public static void main(String[] args) {
        List<Employee> employeeList = List.of(new Employee(101, "raza", "HR", "active", 2000),
                new Employee(107, "reddy", "HR", "active", 2500),
                new Employee(106, "rama", "IT", "inactive", 3000),
                new Employee(105, "shiva", "IT", "active", 3500),
                new Employee(104, "aman", "SALES", "inactive", 4000),
                new Employee(103, "karan", "SALES", "active", 4500),
                new Employee(102, "srinu", "HR", "active", 5000));

        Map<String, List<Employee>> employeesDeptWise =  employeeList.stream().collect(Collectors.groupingBy(Employee::dept, Collectors.toList()));
        employeesDeptWise.entrySet().forEach(entry ->  {
            System.out.println("Department : "+entry.getKey() + " ==> "+ entry.getValue());
        });

        Map<String, Long> employeesCount =  employeeList.stream().collect(Collectors.groupingBy(Employee::dept, Collectors.counting()));
        employeesCount.entrySet().forEach(entry ->{
            System.out.println("Department : "+ entry.getKey() + " Count : "+entry.getValue());
        });
    }
}
