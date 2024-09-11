public class Cours05_retourMethode {
    public Cours05_retourMethode() {
        tester_afficherAddition();
    }

    private void tester_afficherAddition() { //void = cette méthode ne retourne aucune valeur
        afficherAddition(1, 2);
        afficherAddition(-1, 2);
        afficherAddition(1, -2);
        afficherAddition(0, 0);
    }

    private void afficherAddition(int nbA, int nbB) { //void = cette méthode ne retourne aucune valeur
        int somme;

        somme = calculerSomme(nbA, nbB);

        System.out.println("La somme de " + nbA + " et de " + nbB + " est " + somme + ".");
    }

    private int calculerSomme(int nbA, int nbB) { //retourne un entier
        int somme; //toujours définir en premier la variable de retour

        somme = nbA + nbB;
        return somme; //On retourne la variable de retour affecté par cette méthode avec la valeur
    }

    public static void main(String[] args) {
        new Cours05_retourMethode();
    }
}
