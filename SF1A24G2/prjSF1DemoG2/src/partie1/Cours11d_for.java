package partie1;

public class Cours11d_for {
    public Cours11d_for() {
//        tester_estPair();
 //       tester_afficherNbPaires();
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
        estCorrect &= getSommeNbPaires(2, 9) == 20;
        estCorrect &= getSommeNbPaires(-10, 3) == -28;

        System.out.println("getSommeNbPaires() : " + estCorrect);
    }

    //boucle for
    //for (initialisation cu compteur; condition qui doit être vrai pour entrer et poursuivre la boucle; incrementation du compteur)
    //1 - exécuter la partie 1 du for : initialisation du compteur
    //2 - vérifie la condition de la 2e patrie:
    //    -- si c'est vrai : on exécute le code à l'intérieur des accolades
    //    -- si c'est faux : on sort de la boucle (on va au point 6)
    //3 - selon le cas, on exécute l'intérieur des accolades
    //4 - On exécute la 3e partie du for, qui normalement modifie la condition de la partie 2
    //5 - On retourne au point 2
    //6 - La boucle est terminée

    public int getSommeNbPaires(int limiteInf, int limiteSup) {
        int somme; //accumulateur
        int compteur;

        somme = 0;
        for (compteur = limiteInf; compteur <= limiteSup; compteur++) {
            if (estPair(compteur)) {
                somme += compteur;
            }
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

        for (compteur = limiteInf; compteur <= limiteSup; compteur++) {
            if (estPair(compteur)) {
                System.out.print(compteur + " ");
            }
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
        new Cours11d_for();
    }
}
