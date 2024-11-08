package partie1;

public class Cours10_while {
    public Cours10_while() {
        tester_compterDe1AN();
    }

    private void tester_compterDe1AN() {
        compterDe1AN(0);
        compterDe1AN(1);
        compterDe1AN(3);
    }

    public void compterDe1AN (int nbLimite) {
        int compteur;

        System.out.println("Compter de 1 à " + nbLimite);
        compteur = 1;
        while (compteur <= nbLimite) {
            System.out.print (compteur + " ");
//            compteur += 1;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new Cours10_while();
    }

}
