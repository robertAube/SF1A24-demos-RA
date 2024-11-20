package partie2.Cours22_ListePizza;

public class CoordonneTest {
    public CoordonneTest() {
        tester_GetSetDeLObjet();
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
