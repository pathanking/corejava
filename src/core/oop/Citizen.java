package core.oop;

public class Citizen {
    private String firstName;
    private String lastName;
    public static final String COUNTRY = "India";

    public Citizen(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + Citizen.COUNTRY + '\'' +
                '}';
    }

    public void show(){
        System.out.println("First Name : "+firstName);
        System.out.println("Last Name : "+lastName);
    }

    public static void showCountry(){
        System.out.println(COUNTRY);
    }
}
