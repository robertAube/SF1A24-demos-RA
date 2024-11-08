package partie1;

import java.util.Scanner;

public class Cours12_exercice {
    public Cours12_exercice() {
     //   tester_appuyerSurEnterPourContinuer();
        tester_afficherDesLignes();

    }

    //    o	Écrire une méthode qui reçoit en argument un nombre de ligne et qui affiche ce nombre de ligne… Exemple avec un nombre de ligne égale à 3.
    private void tester_afficherDesLignes() {
   //     afficherDesLignes(10);
    //    appuyerSurEnterPourContinuerVDoWhileLaMeilleure();
        afficherDesLignes(200);
    }

    public void afficherDesLignes(int nbLigne) {
        for (int noLigne = 1; noLigne <= nbLigne; noLigne++) {
            System.out.println("Ligne # " + noLigne);
            if (noLigne % 20 == 0) {
                appuyerSurEnterPourContinuerVDoWhileLaMeilleure();
            }
        }
    }


    private void tester_appuyerSurEnterPourContinuer() {
        System.out.println("Début programme");
        // appuyerSurEnterPourContinuerV0();
        appuyerSurEnterPourContinuerVDoWhileLaMeilleure();
        System.out.println("Fin programme");
    }

    //Écrire une méthode java qui attend que l’usager appuie sur la touche entrée seulement.
    public void appuyerSurEnterPourContinuerVDoWhileLaMeilleure() {
        String reponse = "";

        do { //cette boucle est fait au moins une fois!
            reponse = lireString("Appuyer sur la touche <entrée> seulement");
        } while (!reponse.equals(""));
    }

    //Écrire une méthode java qui attend que l’usager appuie sur la touche entrée seulement.
    public void appuyerSurEnterPourContinuerV0() {
        String reponse = "";

        reponse = lireString("Appuyer sur la touche <entrée> seulement"); //cette ligne est répété pour rien

        while (!reponse.equals("")) {
            reponse = lireString("Appuyer sur la touche <entrée> seulement");
        }
    }


    private String lireString(String question) {
        String reponse;
        Scanner sc;

        sc = new Scanner(System.in);

        afficherQuestion(question);
        reponse = sc.nextLine();

        return reponse;
    }

    private void afficherQuestion(String question) {
        System.out.print(question);
    }

    public static void main(String[] args) {
        new Cours12_exercice();
    }
}
