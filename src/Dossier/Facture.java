package Dossier;

public class Facture extends DossierType{
    public int montant;


    public Facture( int numeroDossier,Patient proprietaire, int montant) {
        super( numeroDossier, proprietaire);
        this.montant = montant;
    }

    public Facture ( int numeroDossier,Patient proprietaire){
        super( numeroDossier, proprietaire);
    }

    public Facture(){ };


    public void setMontant(int montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "Facture{" +
                "\n montant=" + montant +
                "\n info proprietaire = '"+super.toString()+
                '}';
    }

    public int getMontant() {
        return montant;
    }
}
