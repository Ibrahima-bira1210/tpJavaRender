package Personnel;

public class Hopital {

    public String Nom_hopital;
    public String Adresse_hopital;
    public int Nombre_lit;
    public CollectionPersonnel <PersonnelAdministratif> Personnel_Administratif;
    public CollectionPersonnel <PersonnelMedical> Personell_Medical;

    /* constructeur*/

    public  Hopital(String Nom_hopital, String Adresse_hopital, int Nombre_lit ,
                    CollectionPersonnel <PersonnelAdministratif> Personnel_Administratif,
                    CollectionPersonnel <PersonnelMedical> Personell_Medical){
        this.Nom_hopital = Nom_hopital;
        this.Adresse_hopital = Adresse_hopital;
        this.Nombre_lit = Nombre_lit;
        this.Personell_Medical = Personell_Medical;
        this.Personnel_Administratif = Personnel_Administratif;

        System.out.println("initialistion d'un hopital");
    }

    /* getteurs*/

    public String getNom_hopital() {
        return Nom_hopital;
    }

    public String getAdresse_hopital() {
        return Adresse_hopital;
    }

    public void setNom_hopital(String nom_hopital) {
        Nom_hopital = nom_hopital;
    }

    public void setAdresse_hopital(String adresse_hopital) {
        Adresse_hopital = adresse_hopital;
    }



    public void setNombre_lit(int nombre_lit) {
        Nombre_lit = nombre_lit;
    }



    /* Setteurs*/

    public void setPersonnel_Administratif(CollectionPersonnel<PersonnelAdministratif> personnel_Administratif) {
        Personnel_Administratif = personnel_Administratif;
    }

    public void setPersonell_Medical(CollectionPersonnel<PersonnelMedical> personell_Medical) {
        Personell_Medical = personell_Medical;
    }

    public int getNombre_lit() {
        return Nombre_lit;
    }

    public CollectionPersonnel<PersonnelAdministratif> getPersonnel_Administratif() {
        return Personnel_Administratif;
    }

    public CollectionPersonnel<PersonnelMedical> getPersonell_Medical() {
        return Personell_Medical;
    }

    @Override
    public String toString() {
        return "Hopital{" +
                "\n Nom_hopital='" + Nom_hopital + '\'' +
                "\n Adresse_hopital='" + Adresse_hopital + '\'' +
                "\n Nombre_lit=" + Nombre_lit +
                "\n Personnel_Administratif=" + this.Personnel_Administratif.toString() +
                "\n Personell_Medical=" + this.Personell_Medical.toString() +
                "\n}";
    }

}
