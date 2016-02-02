
package epfc.cours3449;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonneForm {

    private static Scanner keyb;

    public static void main(String[] args) {
        keyb = new Scanner(System.in);
        ArrayList<Personne> personnes = new ArrayList<>();
        boolean bNext = true;
        while (bNext) {
            Personne2 personne = personneForm();
            personnes.add(personne);
            bNext = encore("Ajouter une autre personne?");
        }
        for(int i=0; i<personnes.size(); i++) {
            System.out.println(personnes.get(i));
        }
    }

    private static Personne1 personneForm() {
        System.out.print("Nom : ");
        String nom = keyb.next();
        Personne2 personne = new Personne2(nom);
        while (encore("Ajouter une adresse?")) {
            personne.add(adresseForm());
        }
        return personne;
    }

    public static boolean encore(String message) {
        System.out.println(message + " Y/N");
        boolean encore = true;
        OUTER:
        while (true) {
            String next = keyb.next();
            if (null != next) {
                switch (next) {
                    case "N":
                        encore = false;
                        break OUTER;
                    case "Y":
                        encore = true;
                        break OUTER;
                    default:
                        System.out.println("Choix erroné, seuls \"Y\" "
                               + " et \"N\" sont autorisés. "
                               + " Veuillez recommencer.");
                        break;
                }
            }
        }
        return encore;
    }

    public static Adresse adresseForm() {
        System.out.print("Rue : ");
        String rue = keyb.next();
        System.out.print("Ville : ");
        String ville = keyb.next();
        return new Adresse(rue, ville);
    }

}
