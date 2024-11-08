package partie1;

public class Cours05_retourMethode {
    public Cours05_retourMethode() {
        tester_afficherSomme();
    }

    private void tester_afficherSomme(){
        afficherSomme(2,3);
        afficherSomme(-2,3);
        afficherSomme(-2,-3);
        afficherSomme(0,0);
        afficherSomme(additionner(2,3),1);
        additionner(2,3);
    }

    private void afficherSomme(int a, int b) {
        String str;

        str = "Somme de " + a + " et " + b;
        System.out.println(str + " est " + additionner(a, b));
    }

    //signature de méthode
    private int additionner(int a, int b) { //retourne un int
        int somme; //variable de retour de même type que le retour

        somme = a + b;

        return somme;
    }

    public static void main(String[] args) {
        new Cours05_retourMethode();
    }
}
