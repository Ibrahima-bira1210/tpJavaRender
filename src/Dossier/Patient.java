package Dossier;



public class Patient {
    public String nomPatient;
    public String prenomPatient;
    public String dateDeNAissance;
    public String lieuDeNaissance;
    public int agePatient;
    public Boolean isMutueled;
    public String adressePatient;
    public int numTelephone;

    public Patient(String nomPatient, String prenomPatient, String dateDeNAissance, String lieuDeNaissance, int agePatient, Boolean isMutueled, String adressePatient, int numTelephone) {
        this.nomPatient = nomPatient;
        this.prenomPatient = prenomPatient;
        this.dateDeNAissance = dateDeNAissance;
        this.lieuDeNaissance = lieuDeNaissance;
        this.agePatient = agePatient;
        this.isMutueled = isMutueled;
        this.adressePatient = adressePatient;
        this.numTelephone = numTelephone;
    }
    public Patient(){}
    @Override
    public String toString() {
        return "Patient{" +
                "\n nomPatient='" + nomPatient + '\'' +
                "\n prenomPatient='" + prenomPatient + '\'' +
                "\n dateDeNAissance=" + dateDeNAissance +
                "\n lieuDeNaissance='" + lieuDeNaissance + '\'' +
                "\n agePatient=" + agePatient +
                "\n isMutueled=" + isMutueled +
                "\n adressePatient='" + adressePatient + '\'' +
                "\n numTelephone=" + numTelephone +
                "\n}";
    }

    /*getters*/

    public String getNomPatient() {
        return nomPatient;
    }

    public String getPrenomPatient() {
        return prenomPatient;
    }

    public String getDateDeNAissance() {
        return dateDeNAissance;
    }

    public String getLieuDeNaissance() {
        return lieuDeNaissance;
    }

    public int getAgePatient() {
        return agePatient;
    }

    public Boolean getMutueled() {
        return isMutueled;
    }

    public String getAdressePatient() {
        return adressePatient;
    }

    public int getNumTelephone() {
        return numTelephone;
    }

    /* setters*/

    public void setNomPatient(String nomPatient) {
        this.nomPatient = nomPatient;
    }

    public void setPrenomPatient(String prenomPatient) {
        this.prenomPatient = prenomPatient;
    }

    public void setDateDeNAissance(String dateDeNAissance) {
        this.dateDeNAissance = dateDeNAissance;
    }

    public void setLieuDeNaissance(String lieuDeNaissance) {
        this.lieuDeNaissance = lieuDeNaissance;
    }

    public void setAgePatient(int agePatient) {
        this.agePatient = agePatient;
    }

    public void setMutueled(Boolean mutueled) {
        isMutueled = mutueled;
    }

    public void setAdressePatient(String adressePatient) {
        this.adressePatient = adressePatient;
    }

    public void setNumTelephone(int numTelephone) {
        this.numTelephone = numTelephone;
    }
}
