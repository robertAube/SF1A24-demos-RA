public class Cours05_retourMethode {
    public Cours05_retourMethode() {
        tester_afficherAddition();
    }

    private void tester_afficherAddition() { //void = cette méthode ne retourne aucune valeur
        int somme;

        somme = calculerSomme(1,2);
        System.out.println("la somme est : " + somme);
    }

    private int calculerSomme(int nbA, int nbB) {
        int somme;

        somme = nbA + nbB;
        return somme;
    }

    public static void main(String[] args) {
        new Cours05_retourMethode();
    }
}
