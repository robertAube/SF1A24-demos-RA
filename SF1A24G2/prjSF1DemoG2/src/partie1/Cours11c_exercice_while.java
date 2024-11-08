package partie1;

public class Cours11c_exercice_while {
    public Cours11c_exercice_while() {
//        tester_estPair();
//        tester_afficherNbPaires();
        tester_getSommeNbPaires();
    }

//    o	Écrire une méthode java afficherNbPaires qui reçoit en argument une limite inférieure et une limite supérieure
//    et qui affiche les nombres pairs entre ces 2 limites inclusivement.

//    o	Écrire une méthode java getSommeNbPaires qui reçoit en argument une limite inférieure et une limite supérieure
//    et qui retourne la somme des nombres pairs entre ces 2 limites inclusivement.

    private void tester_getSommeNbPaires() {
        boolean estCorrect;

        estCorrect = getSommeNbPaires(3, 10) == 28;
        estCorrect &= getSommeNbPaires(3, 3) == 0;
        estCorrect &= getSommeNbPaires(2, 9) == 20 ;
        estCorrect &= getSommeNbPaires(-10, 3) == -28;

        System.out.println("getSommeNbPaires() : " + estCorrect);
    }
    public int getSommeNbPaires(int limiteInf, int limiteSup) {
        int somme; //accumulateur
        int compteur;

        somme = 0;
        compteur = limiteInf;
        while (compteur <= limiteSup) {
            if (estPair(compteur)) {
                somme += compteur;
            }
            compteur++;
        }

        return somme;
    }

    private void tester_afficherNbPaires() {
        afficherNbPaires(3, 10);
        afficherNbPaires(3, 3);
        afficherNbPaires(2, 9);
        afficherNbPaires(-10, 3);
    }

    public void afficherNbPaires(int limiteInf, int limiteSup) {
        int compteur;

        compteur = limiteInf;
        while (compteur <= limiteSup) {
            if (estPair(compteur)) {
                System.out.print(compteur + " ");
            }
            compteur++;
        }
        System.out.println("");
    }

    public boolean estPair(int nb) {
        boolean estPair;
        int restant;

        restant = nb % 2;
        estPair = restant == 0;

        return estPair;
    }

    private void tester_estPair() {
        boolean estCorrect;

        estCorrect = estPair(10) == true;
        estCorrect &= estPair(9) == false;
        estCorrect &= estPair(0) == true;

        System.out.println("estPair() : " + estCorrect);
    }

    public static void main(String[] args) {
        new Cours11c_exercice_while();
    }
}
