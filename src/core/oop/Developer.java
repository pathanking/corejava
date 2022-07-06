package core.oop;

public class Developer extends Employee {
    String address;

    public Developer(String name, Double salary, String address) {
        super(name, salary);
        this.address = address;
    }
}

class InheritanceTest { //package-private
    public static void main(String[] args) {
        Developer developer = new Developer("Siva", 5500.5, "Vizag");
        //developer.printEmployeeDetails();
        System.out.println(developer);
        System.out.println("Developer Name : " + developer.name);
        System.out.println("Developer Salary : " + developer.salary);
        System.out.println("Developer Address : " + developer.address);
        System.out.println(developer.hashCode());
        System.out.println(developer.getClass().getName());
    }
}
