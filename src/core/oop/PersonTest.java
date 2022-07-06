package core.oop;

public class PersonTest {
    public static void main(String[] args) {

        Person person = new Person();
        person.setPersonId(101);
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAddress("Chennai");
        person.setProfession("Developer");
        person.setMobile(8877665544L);
        Person person2 = new Person();
        person2.setPersonId(102);
        person2.setFirstName("James");
        person2.setLastName("Abraham");
        person2.setAddress("Delhi");
        person2.setProfession("Developer");
        person2.setMobile(8877665544L);

        System.out.println(getPerson(person2));
        /*Person[] persons = new Person[3];
        persons[0] = person;
        persons[1] = person2;
        persons[2] = new Person();

        for (Person p : persons) {
            PersonDTO personDTO = new PersonDTO();
            personDTO.setFirstName(p.getFirstName());
            personDTO.setLastName(p.getLastName());
            personDTO.setProfession(p.getProfession());
            System.out.println(personDTO);
        }*/
    }
    public static PersonDTO getPerson(Person person){
       return new PersonDTO(person);
    }
}
