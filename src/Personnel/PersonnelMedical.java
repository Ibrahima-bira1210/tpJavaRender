package Personnel;

import Dossier.DossierMedical;
import Dossier.Patient;

import java.util.Scanner;

public class PersonnelMedical extends Personnel {

    public PersonnelMedical(String nom, String premom, int age) {
        super(nom, premom, age);
    }

    public String interrogation(DossierMedical dm){
        return dm.toString();
    }

    public void editerDossierMedical(DossierMedical dm){

        Scanner scanner = new Scanner(System.in);
        System.out.println("renseigner les allergies du patient ");

        System.out.println("Le patient a t'il une maladie cardiaque ?");
        dm.maladieCArdiaque = scanner.nextBoolean();
        System.out.println("Le patient a t'il une maladie pulmonaire ?");
        dm.maladiePulmonaire=scanner.nextBoolean();

    }

    @Override
    public String toString() {
        return "PersonnelMedical{" +
                "\n nom='" + nom + '\'' +
                "\n premom='" + premom + '\'' +
                "\n age=" + age +
                "\n}";
    }
}
