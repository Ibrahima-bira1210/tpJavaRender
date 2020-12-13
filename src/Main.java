import Dossier.Dossier;
import Personnel.Hopital;
import initialisation.InitialisePersonnel;
import Dossier.DossierType;
import Dossier.DossierMedical;
import Dossier.Facture;


public class Main {
    public static void main(String arg[]){
        InitialisePersonnel personnel = new InitialisePersonnel();
        Hopital MaSante = new Hopital("Ma_Sante","EPT",15,personnel.initialiserPersonnelAdministratif(),personnel.initialiserPersonnelMedical());

        System.out.println(MaSante);

        Dossier <DossierType> d1 = personnel.initialiserReceptionniste().Inscription_administratif(MaSante);

        DossierMedical dm = personnel.initialiseInfirmier().initialiserDossierMedical(d1.dossierMedical.getProprietaire());
        personnel.initialiserMedecin().editerDossierMedical((DossierMedical) d1.dossierMedical);
        d1.dossierMedical=dm;

        Facture f = personnel.initialiseComptable().Editer_Facture(d1.facture.getProprietaire());
        d1.facture = f;

        System.out.println(d1);


    }
}
