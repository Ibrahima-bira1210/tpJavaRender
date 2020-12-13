package Personnel;

public class PersonnelAdministratif extends Personnel{

    public PersonnelAdministratif(String nom, String premom, int age) {
        super(nom, premom, age);
    }

    @Override
    public String toString() {
        return "PersonnelAdministratif{" +
                "\n nom='" + nom + '\'' +
                "\n premom='" + premom + '\'' +
                "\n age=" + age +
                "\n}";
    }
}
