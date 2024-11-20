package partie2.Cours21_tabDePizzas;

public class Coordonnee_test {
    public Coordonnee_test() {
        tester_getSetDeLObjet();
        testPasRapport();
    }

    private void testPasRapport() {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "Abc";

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //false
    }

    private void tester_getSetDeLObjet() {
        Coordonnee c1;
        Coordonnee c2;

        c1 = new Coordonnee(4,5);

        System.out.println(c1); // (4, 5)

        c2 = c1.get();

        System.out.println(c2); // (4, 5)

        c2.setX(9);

        System.out.println(c1); // (4, 5)
        System.out.println(c2); // (9, 5)

        c1.set(c2);

        System.out.println(c1); // (9, 5)
    }

    public static void main(String[] args) {
        new Coordonnee_test();
    }
}
