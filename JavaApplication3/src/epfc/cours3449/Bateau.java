/*
Bateau hérite de véhicule (classe fille)
 */

package epfc.cours3449;

public class Bateau extends Vehicule {
    public double tirantDEau;
    
    void larguerLesAmarres() {
        System.out.println("Bateau " + getAge() + " - " + tirantDEau + 
                " largue les amarres");
    }
    
    public static void main(String[] args) {
        Bateau b = new Bateau();
        b.setAge(10);
        b.tirantDEau = 12.7;
        b.start();
        b.stop();
        b.larguerLesAmarres();
        
        Vehicule v = b;
        v.setAge(11);
        v.start();
        v.stop();
        
        System.out.println(b.getAge());
    }
}
