
package epfc.cours3449;

public class Independant extends Travailleur {
    String nrEntreprise;

    @Override
    public double calculImpots() {
        return getRevenu()/10;
    }

    public String getNrEntreprise() {
        return nrEntreprise;
    }

    public void setNrEntreprise(String nrEntreprise) {
        this.nrEntreprise = nrEntreprise;
    }
    
    
}
