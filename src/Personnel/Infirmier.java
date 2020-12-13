package Personnel;

import Dossier.DossierMedical;
import Dossier.Patient;

import java.util.Random;
import java.util.Scanner;

public class Infirmier extends PersonnelMedical {

    public Infirmier(String nom, String premom, int age) {
        super(nom, premom, age);
    }

    public DossierMedical initialiserDossierMedical (Patient p){
        DossierMedical dm = new DossierMedical();
        dm.proprietaire = p;
        dm.numeroDossier = new Random().nextInt(1000);
        Scanner scanner = new Scanner(System.in);
        System.out.print("renseigner le groupe sanguin du patient: ");
        dm.groupeSangin = scanner.nextLine();
        System.out.print("renseigner les allergies du patient : " );
        dm.allergie=scanner.nextLine();
        System.out.print("Le patient a t'il une maladie cardiaque ?: ");
        dm.maladieCArdiaque = scanner.nextBoolean();
        System.out.print("Le patient a t'il une maladie pulmonaire ?: ");
        dm.maladiePulmonaire=scanner.nextBoolean();
        return dm;
    }

    @Override
    public String toString() {
        return "Infirmier{" +
                "\n nom='" + nom + '\'' +
                "\n premom='" + premom + '\'' +
                "\n age=" + age +
                "\n}";
    }
}
