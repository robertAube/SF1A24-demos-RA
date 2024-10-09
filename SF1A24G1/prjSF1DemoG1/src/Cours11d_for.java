public class Cours11d_for {
    public Cours11d_for() {
        //tester_estPair();
        tester_afficherNbPaires();
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
        int compteur;

        //boucle for
        //for (initialisation du compteur; condition qui doit être pour entrer et poursuivre la boucle; incrementation du compteur)
        //1 - exécuter la partie 1 du for : initialisation du compteur
        //2 - vérifie la condition de la 2e partie
        //    -- si c'est vrai : on exécute le code à l'intérieur des accolades
        //    -- si c'est faux : on sort de la boucle
        //3 - selon le cas, on exécute l'intérieur de la boucle
        //4 - On exécute la 3e partie du for, qui normalement modifie la condition de la partie 2
        //5 - On retourne au point 2//

        for (compteur = limiteInf; compteur <= limiteSup; compteur++) {
            if (estPair(compteur)) {
                System.out.print(compteur + " ");
            }
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
        int compteur;

        somme = 0;
        for (compteur = limiteInf; compteur <= limiteSup; compteur++) {
            if (estPair(compteur)) {
                somme += compteur;
            }
        }

        return somme;
    }
    public boolean estPair(int nb) {
        boolean estPair = nb % 2 == 0;
        return estPair;
    }

    public static void main(String[] args) {
        new Cours11d_for();

    }
}
