package Dossier;




public class DossierType {


    public int numeroDossier;
    public Patient proprietaire;

    public DossierType( int numeroDossier, Patient proprietaire) {
        this.numeroDossier = numeroDossier;
        this.proprietaire = proprietaire;
    }

    public DossierType() {

    }


    @Override
    public String toString() {
        return "DossierType{" +
                ", numeroDossier='" + numeroDossier + '\'' +
                ", proprietaire=" + proprietaire +
                '}';
    }



    public int getNumeroDossier() {
        return numeroDossier;
    }

    public Patient getProprietaire() {
        return proprietaire;
    }


    public void setNumeroDossier(int numeroDossier) {
        this.numeroDossier = numeroDossier;
    }

    public void setProprietaire(Patient proprietaire) {
        this.proprietaire = proprietaire;
    }
}
