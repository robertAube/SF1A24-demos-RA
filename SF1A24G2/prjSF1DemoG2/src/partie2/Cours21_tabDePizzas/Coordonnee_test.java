package partie2.Cours21_tabDePizzas;

public class Coordonnee_test {
    public Coordonnee_test() {
//        tester_getSetDeLObjet();
//
//        testPasRapport();
        tester_equals();
    }

    private void tester_equals() {
        boolean estReussi = true;
        estReussi &= retourneVraiSiCEstLeMemeObjet() == true;
        estReussi &= retourneFauxSiObjetEnArgumentEstNull() == false;
        estReussi &= retourneFauxSiObjetEnArgumentEstDeTypeDifferent() == false;
        estReussi &= retourneFauxSiXEstDifferent() == false;
        estReussi &= retourneFauxSiYEstDifferent() == false;
        estReussi &= retourneVraiSiXetYEstPareil() == true;
        System.out.println("equals() " + (estReussi ? "fonctionne!" : "ne fonctionne pas..."));
    }

    private boolean retourneVraiSiXetYEstPareil() {
        Coordonnee c1;
        Coordonnee c2;

        c1 = new Coordonnee(4, 5);
        c2 = new Coordonnee(4, 5);

        return c1.equals(c2);
    }

    private boolean retourneFauxSiYEstDifferent() {
        Coordonnee c1;
        Coordonnee c2;

        c1 = new Coordonnee(4, 5);
        c2 = new Coordonnee(4, 4);

        return c1.equals(c2);
    }

    private boolean retourneFauxSiXEstDifferent() {
        Coordonnee c1;
        Coordonnee c2;

        c1 = new Coordonnee(4, 5);
        c2 = new Coordonnee(5, 5);

        return c1.equals(c2);
    }

    private boolean retourneFauxSiObjetEnArgumentEstDeTypeDifferent() {
        Coordonnee c1;

        c1 = new Coordonnee(4, 5);

        return c1.equals("allo");
    }

    private boolean retourneFauxSiObjetEnArgumentEstNull() {
        Coordonnee c1;
        Coordonnee cNull = null;

        c1 = new Coordonnee(4, 5);

        return c1.equals(cNull);
    }

    private boolean retourneVraiSiCEstLeMemeObjet() {
        Coordonnee c1;

        c1 = new Coordonnee(4, 5);

        return c1.equals(c1);
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

        c1 = new Coordonnee(4, 5);

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
