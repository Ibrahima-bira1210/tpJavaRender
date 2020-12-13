package Dossier;

import java.util.ArrayList;


public class Dossier <DossierType >extends ArrayList {

    public DossierType dossierMedical;
    public DossierType dossierAdministratif;
    public DossierType facture;

    public Dossier(DossierType dossierMedical, DossierType dossierAdministratif, DossierType facture) {
        this.dossierMedical = dossierMedical;
        this.dossierAdministratif = dossierAdministratif;
        this.facture = facture;

        this.add(this.dossierMedical);
        this.add(this.dossierAdministratif);
        this.add(this.facture);
    }
    public Dossier(){};

    @Override
    public String toString() {
        return "Dossier{" +
                ", dossierAdministratif=" + dossierAdministratif.toString() +
                "dossierMedical=" + dossierMedical.toString() +
                ", facture=" + facture.toString() +
                '}';
    }


}
