
package epfc.cours3449;

public class Statutaire extends Travailleur{

    @Override
    public double calculImpots() {
        return getRevenu()/25;
    }
    
}
