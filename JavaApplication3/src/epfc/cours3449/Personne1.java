
package epfc.cours3449;

public class Personne1 {
    private String nom;
    private Adresse adresse;

    public Personne1(String nom, Adresse adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", adresse=" + adresse + '}';
    }
    
    
}
