package partie1;

public class Cours10_while {
    public Cours10_while() {
        tester_compterDe1AN();
    }

    private void tester_compterDe1AN() {
        compterDe1AN(3);
        compterDe1AN(1);
        compterDe1AN(0);
        compterDe1AN(20);
    }

    public void compterDe1AN(int nbLimite) {
        int compteur;

        compteur = 1;
        while (compteur <= nbLimite) { //tant que la condition est vrai
            System.out.print(compteur + " ");
            compteur += 1;  //important de modifier la condition de fin dans la boucle sinon boucle infinie
        }
        System.out.println(); //saut de ligne
    }

    public static void main(String[] args) {
        new Cours10_while();
    }
}
