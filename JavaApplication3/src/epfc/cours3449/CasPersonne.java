
package epfc.cours3449;

public class CasPersonne {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if(age < 0 || age > 200) {
            throw new Exception("Age (" + age + ") est hors limite [0-200]");
        }
        this.age = age;
    }
    
}
