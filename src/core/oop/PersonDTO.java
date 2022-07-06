package core.oop;

public class PersonDTO {
    private String firstName;
    private String lastName;
    private String profession;

    public String getFirstName() {
        return firstName;
    }
    public PersonDTO(){}

    public PersonDTO(Person person){
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
        this.profession = person.getProfession();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}
