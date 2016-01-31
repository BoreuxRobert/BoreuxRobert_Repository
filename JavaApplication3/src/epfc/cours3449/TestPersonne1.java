
package epfc.cours3449;

public class TestPersonne1 {
    public static void main(String[] args) {
        Personne1 p = new Personne1("Alfred", new Adresse("Les maisons", "XL"));
        System.out.println(p);
        p.getAdresse().setRue("Du Coq");
        System.out.println(p);
    }
}
