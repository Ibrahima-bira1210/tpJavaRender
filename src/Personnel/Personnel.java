package Personnel;

public class Personnel {
    /* attributs of personel */

    public String nom ;
    public String premom;
    public int age;

    /* constructor*/

    public Personnel(String nom, String premom, int age) {
        this.nom = nom;
        this.premom = premom;
        this.age = age;
    }
    public void lancer_processus(){

    };

    public String getNom() {
        return nom;
    }

    public String getPremom() {
        return premom;
    }



    public int getAge() {
        return age;
    }
}
