package core.oop;

public class Person {
    private Integer personId;
    private String firstName;
    private String lastName;
    private String profession;
    private String address;
    private Long mobile;
    public Person(){}

    public Person(Integer personId, String firstName, String lastName, String profession, String address, Long mobile) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.profession = profession;
        this.address = address;
        this.mobile = mobile;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", profession='" + profession + '\'' +
                ", address='" + address + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
