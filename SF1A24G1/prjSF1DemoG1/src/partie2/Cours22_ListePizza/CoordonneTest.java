package partie2.Cours22_ListePizza;

public class CoordonneTest {
    public CoordonneTest() {
       // tester_GetSetDeLObjet();
        tester_equals();
    }

    private void tester_equals() {
        boolean estReussi = true;

        estReussi &= retourneVraiSiCEstLeMemeObjet() == true;
        estReussi &= retourneFauxSiObjetEnArgumentEstNull() == false;
        estReussi &= retourneFauxSiObjetEnArgumentEstDeTypeDifferent() == false;
        estReussi &= retourneFauxSiXestDifferrent() == false;
        estReussi &= retourneVraiSiXEgalEtYaussi() == true;
        estReussi &= retourneFauxSiXEgalEtYEstDifferent() == false;

        System.out.println("equals() " + (estReussi ? "fonctionne" : "ne fonctionne pas"));
    }

    private boolean retourneFauxSiXEgalEtYEstDifferent() {
        Coordonnee c1 = new Coordonnee(1, 2);
        Coordonnee c2 = new Coordonnee(1, 1);

        return c1.equals(c2);
    }

    private boolean retourneVraiSiXEgalEtYaussi() {
        Coordonnee c1 = new Coordonnee(1, 2);
        Coordonnee c2 = new Coordonnee(1, 2);

        return c1.equals(c2);
    }

    private boolean retourneFauxSiXestDifferrent() {
        Coordonnee c1 = new Coordonnee(1, 2);
        Coordonnee c2 = new Coordonnee(2, 2);

        return c1.equals(c2);
    }

    private boolean retourneFauxSiObjetEnArgumentEstDeTypeDifferent() {
        Coordonnee c1 = new Coordonnee(1, 2);

        return c1.equals("Allo");
    }

    private boolean retourneFauxSiObjetEnArgumentEstNull() {
        Coordonnee c1 = new Coordonnee(1, 2);
        Coordonnee c2 = null;

        return c1.equals(c2);
    }

    private boolean retourneVraiSiCEstLeMemeObjet() {
       Coordonnee c1 = new Coordonnee(1, 2);

       return c1.equals(c1);
    }

    private void tester_GetSetDeLObjet() {
        Coordonnee c1;
        Coordonnee c2;

        c1 = new Coordonnee(4,5);

        System.out.println(c1); //(4, 5)

        c2 = c1.get();

        System.out.println(c2); //(4, 5)

        c2.setX(9);

        System.out.println(c1); //(4, 5)
        System.out.println(c2); //(9, 5)

        c1.set(c2);

        System.out.println(c1); //(9, 5)
    }

    public static void main(String[] args) {
        new CoordonneTest();
    }
}
