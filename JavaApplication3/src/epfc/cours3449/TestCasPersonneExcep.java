
package epfc.cours3449;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestCasPersonneExcep {

    public static void main(String[] args) {
        CasPersonne p = new CasPersonne();
        try {
            p.setAge(-5);
        } catch (Exception ex) {
            System.out.println(ex.toString());
            ex.printStackTrace();
        }
    }
}
