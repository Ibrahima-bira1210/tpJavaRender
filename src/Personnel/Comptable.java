package Personnel;

import Dossier.Facture;
import Dossier.Patient;

import java.util.Random;
import java.util.Scanner;

public class Comptable extends PersonnelAdministratif{

    public Comptable(String nom, String premom, int age) {
        super(nom, premom, age);
    }

    public Facture Editer_Facture(Patient p){
        Facture f = new Facture();
        Scanner scanner = new  Scanner(System.in);
        System.out.print("Veuillez entrer le montant de la facture :");
        f.montant =  scanner.nextInt();
        f.proprietaire = p;
        return f;
    }

    @Override
    public String toString() {
        return "Comptable{" +
                "\n nom='" + nom + '\'' +
                "\n premom='" + premom + '\'' +
                "\n age=" + age +
                "\n}";
    }
}
