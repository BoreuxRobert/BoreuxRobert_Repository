/*
 */
package epfc.cours3449;

public class TestVehiculesList {

    public static void main(String[] args) {
        Vehicule[] vs = new Vehicule[4];
        vs[0] = new Vehicule();
        vs[0].setAge(1);
        vs[1] = new Bateau();
        vs[1].setAge(2);
        vs[2] = new Voiture();
        vs[2].setAge(3);
        vs[3] = new Bateau();
        vs[3].setAge(4);
        for(int i=0; i<vs.length; i++) {
            vs[i].start();
        }
        for(int i=0; i<vs.length; i++) {
            vs[i].stop();
        }
    }
}
