package Personnel;

import Dossier.CollectionPatient;
import Dossier.Dossier;
import Dossier.DossierAdministratif;
import Dossier.Patient;
import Dossier.DossierMedical;
import Dossier.Facture;
import Dossier.DossierType;
import initialisation.InitialisePersonnel;

import java.util.Random;
import java.util.Scanner;

public class Receptionniste extends PersonnelAdministratif {


    public Receptionniste(String nom, String premom, int age) {
        super(nom, premom, age);
    }

                         /* INSCRIPTION*/

    public Dossier Inscription_administratif(Hopital h){
        Patient p = new Patient();
        Dossier <DossierType> dossier = new Dossier();
        if (h.getNombre_lit() > 0){

            Scanner scanner = new Scanner(System.in);
            System.out.print("Veuillez entrer l'adresse du patient :");
            p.adressePatient = scanner.nextLine();
            System.out.print("Veuillez entrer le prenom du patient :");
            p.prenomPatient = scanner.nextLine();
            System.out.print("Veuillez entrer le nom du patient :");
            p.nomPatient = scanner.nextLine();
            System.out.print("Veuillez entrer la date de naissance du patient :");
            p.dateDeNAissance =  scanner.nextLine();
            System.out.print("Veuillez entrer le lieu de naissance du patient :");
            p.lieuDeNaissance = scanner.nextLine();
            System.out.print("Veuillez entrer l'age du patient :");
            p.agePatient = scanner.nextInt();
            System.out.print("Veuillez entrer le numero de telephone du patient :");
            p.numTelephone = scanner.nextInt();
            System.out.print("Le patient a t'il un mutuel ? :");
            p.isMutueled = scanner.nextBoolean();

            Random rand = new Random();
            int num = rand.nextInt(1000);
            DossierAdministratif da = new DossierAdministratif(num, p);
            DossierMedical dm = new DossierMedical(num,p);
            Facture facture = new Facture(num,p);
            dossier.dossierMedical=dm;
            dossier.facture=facture;
            dossier.dossierAdministratif=da;
            System.out.println("Dossier  cree");

        }

        else {
            System.out.println("Redirection vers un autre hopital");
        }
        return dossier;

    }

    @Override
    public String toString() {
        return "Receptionniste{" +
                "\n nom='" + nom + '\'' +
                "\n premom='" + premom + '\'' +
                "\n age=" + age +
                "\n}";
    }
}
