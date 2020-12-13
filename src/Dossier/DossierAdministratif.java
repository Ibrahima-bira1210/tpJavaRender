package Dossier;

public class DossierAdministratif extends DossierType{



    public DossierAdministratif(int numeroDossier, Patient proprietaire) {
        super(numeroDossier, proprietaire);

    }

    @Override
    public String toString() {
        return "DossierAdministratif{" +
                "\n info proprietaire='"+super.toString();

    }


}
