import Dossier.Dossier;
import Personnel.Hopital;
import initialisation.InitialisePersonnel;
import Dossier.DossierType;
import Dossier.DossierMedical;
import Dossier.Facture;

import java.util.Scanner;


public class Main {
    public static void main(String arg[]){
        InitialisePersonnel personnel = new InitialisePersonnel();
        Hopital MaSante = new Hopital("Ma_Sante","EPT",15,personnel.initialiserPersonnelAdministratif(),personnel.initialiserPersonnelMedical());

        System.out.println("******************************************************");
        System.out.println("*                                                    *");
        System.out.println("*         Bienvenue a l'hopital MaSante              *");
        System.out.println("*                                                    *");
        System.out.println("******************************************************");


        System.out.println("1.info hopital");
        System.out.println("2. lancer processus d'admission");
        System.out.print("Tapez votre choix: ");
        Scanner scanner = new Scanner(System.in);
        int choix = scanner.nextInt();

        switch (choix){
            case 1:
                System.out.println(MaSante);
                break;
            case 2:
                Dossier <DossierType> d1 = personnel.initialiserReceptionniste().Inscription_administratif(MaSante);

                DossierMedical dm = personnel.initialiseInfirmier().initialiserDossierMedical(d1.dossierMedical.getProprietaire());
                personnel.initialiserMedecin().editerDossierMedical((DossierMedical) d1.dossierMedical);
                d1.dossierMedical=dm;

                Facture f = personnel.initialiseComptable().Editer_Facture(d1.facture.getProprietaire());
                d1.facture = f;

                System.out.println(d1);
                break;
            default:
                System.out.println("Au revoir ");
                break;
        }

    }
}
