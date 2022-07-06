package core.oop;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("raza", 2345.67);
        Employee employee1 = new Employee("shiva", 2346.67);
        employee.printEmployeeDetails();
        employee1.printEmployeeDetails();
    }
}
