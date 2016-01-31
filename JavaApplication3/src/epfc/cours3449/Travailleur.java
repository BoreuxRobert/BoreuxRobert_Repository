
package epfc.cours3449;

public abstract class Travailleur {
    private double revenu = 0;
    
    public abstract double calculImpots();

    public double getRevenu() {
        return revenu;
    }

    public void setRevenu(double revenu) {
        this.revenu = revenu;
    }
    
}
