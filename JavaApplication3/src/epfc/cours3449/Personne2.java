
package epfc.cours3449;

import java.util.ArrayList;

public class Personne2 {
    String nom;
    ArrayList<Adresse> adresses = new ArrayList<>();

    public Personne2(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Personne{" + "adresses=" + adresses + '}';
    }
    
    public void add(Adresse a) {
        adresses.add(a);
    } 
    
    
}
