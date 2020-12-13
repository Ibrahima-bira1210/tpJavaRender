package Personnel;


import initialisation.InitialisePersonnel;

import java.util.ArrayList;

public class CollectionPersonnel <T extends Personnel> extends ArrayList {
    public String Nom;

    public CollectionPersonnel (String nom ) {
        this.Nom = nom;
    }

    public void Add(Personnel p){
        this.add(p);
    }


}





