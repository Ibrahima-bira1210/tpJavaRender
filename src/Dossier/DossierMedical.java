package Dossier;
import Personnel.Medecin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class DossierMedical extends DossierType {

    public String groupeSangin;
    public Medecin medcinTraitant;
    public String analyseMedical;
    public String allergie;
    public boolean maladieCArdiaque;
    public boolean maladiePulmonaire;

    /*constructor */

    public DossierMedical( int numeroDossier,
                          Patient proprietaire, String groupeSangin,
                          /*Medecin medcinTraitant,*/  String analyseMedical,
                          String allergie, boolean maladieCArdiaque, boolean maladiePulmonaire) {
        super(numeroDossier, proprietaire);
        this.groupeSangin = groupeSangin;
        /*this.medcinTraitant = medcinTraitant;*/
        this.analyseMedical = analyseMedical;
        this.allergie = allergie;
        this.maladieCArdiaque = maladieCArdiaque;
        this.maladiePulmonaire = maladiePulmonaire;
    }

    public DossierMedical(int numeroDossier,
                          Patient proprietaire){
        super(numeroDossier, proprietaire);

    };

    public DossierMedical(){};



    public String toString() {
        return "DossierMedical{" +
                "\n groupeSangin='" + groupeSangin + '\'' +
                /*"\n medcinTraitant=" + medcinTraitant + */
                "\n allergie=" + allergie +
                "\n maladieCArdiaque=" + maladieCArdiaque +
                "\n maladiePulmonaire=" + maladiePulmonaire +
                "\n info proprietaire ="+super.toString()+
                "\n}";
    }

    public String toStringAnalyse(){
        return "Analye {" + analyseMedical.toString() + "}";
    }



    /* Getters*/



    public String getGroupeSangin() {
        return groupeSangin;
    }

    public void setGroupeSangin(String groupeSangin) {
        this.groupeSangin = groupeSangin;
    }

   /* public Medecin getMedcinTraitant() {
        return medcinTraitant;
    }

    public void setMedcinTraitant(Medecin medcinTraitant) {
        this.medcinTraitant = medcinTraitant;
    }*/

    public  String getAnalyseMedical() {
        return analyseMedical;
    }

    /*setters*/

    public void setAnalyseMedical(String analyseMedical) {
        this.analyseMedical = analyseMedical;
    }

    public String getAllergie() {
        return allergie;
    }

    public void setAllergie(String allergie) {
        this.allergie = allergie;
    }

    public boolean isMaladieCArdiaque() {
        return maladieCArdiaque;
    }

    public void setMaladieCArdiaque(boolean maladieCArdiaque) {
        this.maladieCArdiaque = maladieCArdiaque;
    }

    public boolean isMaladiePulmonaire() {
        return maladiePulmonaire;
    }

    public void setMaladiePulmonaire(boolean maladiePulmonaire) {
        this.maladiePulmonaire = maladiePulmonaire;
    }

    public Patient getpatient(){
        return super.getProprietaire();
    }



}
