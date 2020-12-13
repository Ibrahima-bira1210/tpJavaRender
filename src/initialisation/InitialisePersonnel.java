package initialisation;

import Dossier.CollectionPatient;
import Personnel.*;

public class InitialisePersonnel  {

    public InitialisePersonnel(){}

    public Medecin initialiserMedecin(){
        Medecin medecin1 =  new Medecin("Fall","Fallilou",24);
        return  medecin1;
    }
    public Infirmier initialiseInfirmier(){
        Infirmier infirmier1 = new Infirmier("Sow","Mame Diarra",23);
        return infirmier1;
    }
    public Comptable initialiseComptable(){
        Comptable comptable1 = new Comptable("Diakhate","Fallou",22);
        return comptable1;
    }
    public Receptionniste initialiserReceptionniste(){
        Receptionniste receptionniste1 = new Receptionniste("Faye","Ibrahima",22);
        return receptionniste1;
    }

   public CollectionPersonnel<PersonnelMedical>   initialiserPersonnelMedical(){
       CollectionPersonnel<PersonnelMedical> personnelmedical1 = new CollectionPersonnel<PersonnelMedical>("personelmedical1");
       personnelmedical1.Add(new InitialisePersonnel().initialiserMedecin());
       personnelmedical1.Add(new InitialisePersonnel().initialiseInfirmier());
       return personnelmedical1;

   }
   public CollectionPersonnel<PersonnelAdministratif>  initialiserPersonnelAdministratif(){
       CollectionPersonnel<PersonnelAdministratif> personneladministratif1 = new CollectionPersonnel<PersonnelAdministratif>("personneladministratif1");
       personneladministratif1.Add(new InitialisePersonnel().initialiseComptable());
       personneladministratif1.Add(new InitialisePersonnel().initialiserReceptionniste());
       return personneladministratif1;
   }


}
