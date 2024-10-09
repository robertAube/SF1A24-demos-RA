public class Cours11c_exercice_while {
    public Cours11c_exercice_while() {
        //tester_estPair();
//        tester_afficherNbPaires();
        tester_getSommeNbPaires();
    }

    private void tester_estPair() {
        boolean estReussi;

        estReussi = estPair(0) == true;
        estReussi &= estPair(1) == false;
        estReussi &= estPair(-1) == false;
        estReussi &= estPair(100) == true;

        System.out.println("estPair() : " + estReussi);
    }

    private void tester_afficherNbPaires() {
        afficherNbPaires(1, 7);
        afficherNbPaires(0, 6);
        afficherNbPaires(6, 6);
        afficherNbPaires(7, 6);
    }

    /*
    o	Écrire une méthode java afficherNbPaires qui reçoit
    en argument une limite inférieure et une limite supérieure et qui affiche les nombres pairs entre ces 2 limites
     */
    public void afficherNbPaires(int limiteInf, int limiteSup) {
        int compteur = limiteInf;

        while (compteur <= limiteSup) {
            if (estPair(compteur)) {
                System.out.print(compteur + " ");
            }
            compteur++;
        }
        System.out.println();
    }

    private void tester_getSommeNbPaires() {
        boolean estReussi;

        estReussi = getSommeNbPaires(1, 7) == 12;
        estReussi &= getSommeNbPaires(0, 6) == 12;
        estReussi &= getSommeNbPaires(6, 6) == 6;
        estReussi &= getSommeNbPaires(7, 6) == 0;

        System.out.println("getSommeNbPaires() : " + estReussi);
    }


    /*
    o	Écrire une méthode java getSommeNbPaires qui reçoit
     en argument une limite inférieure et une limite supérieure
     et qui retourne la somme des nombres pairs entre ces 2 limites.
     */
    public int getSommeNbPaires(int limiteInf, int limiteSup) {
        int somme; //accumulateur
        int compteur = limiteInf;

        somme = 0;
        while (compteur <= limiteSup) {
            if (estPair(compteur)) {
                somme += compteur;
            }
            compteur++;
        }

        return somme;
    }
    public boolean estPair(int nb) {
        boolean estPair = nb % 2 == 0;
        return estPair;
    }

    public static void main(String[] args) {
        new Cours11c_exercice_while();

    }
}
