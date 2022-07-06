package core.oop;

public class CitizenTest {
    public static void main(String[] args) {
        Citizen citizen = new Citizen("mahendra","singh");
        Citizen citizen1 = new Citizen("manoj","singh");
        Citizen citizen2 = new Citizen("sai","krishna");

        citizen.show();
        citizen1.show();
        citizen2.show();
        Citizen.showCountry();

    }
}
