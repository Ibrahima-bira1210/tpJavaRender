package Personnel;

import Dossier.DossierMedical;
import Dossier.DossierType;

import java.util.Scanner;

public class Medecin extends PersonnelMedical{

    public Medecin(String nom, String premom, int age) {
        super(nom, premom, age);
    }

    public String interrogation(DossierMedical dm){
        return dm.toString() + "/n"+ dm.toStringAnalyse();

    }

    public void editerDossierMedical(DossierMedical dm){
        Scanner scanner = new Scanner(System.in);
        System.out.println("renseigner les analyses  du patient ");
        dm.allergie=scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Medecin{" +
                "\n nom='" + nom + '\'' +
                "\n premom='" + premom + '\'' +
                "\n age=" + age +
                "\n}";
    }
}
