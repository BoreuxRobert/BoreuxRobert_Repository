/*
 */

package epfc.cours3449;

public class Voiture extends Vehicule {
    double consommation;
    String couleur;
    public static void main(String[] args) {
        Voiture v = new Voiture();
        v.consommation = 4.5;
        v.couleur = "vert";
        v.setAge(15);
        v.start();
        v.stop();
    }
    @Override
    public void start() {
        System.out.println("Voiture " + this.getAge() + " " + couleur + " "
         + consommation + " start");
    }
}
