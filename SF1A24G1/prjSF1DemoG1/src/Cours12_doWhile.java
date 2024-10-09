import java.util.Scanner;

public class Cours12_doWhile {
    public Cours12_doWhile() {
        tester_appuyerSurEnterPourContinuer();
        tester_afficherDesLignes();

    }

    private void tester_appuyerSurEnterPourContinuer() {
        System.out.println("Début programme");
        appuyerSurEnterPourContinuerVdoWhileLaMeilleur();
        appuyerSurEnterPourContinuerVwhile();
        System.out.println("Fin programme");
    }



    public void appuyerSurEnterPourContinuerVwhile() {
        String strLu = "";

        strLu = lireString("Appuyez sur Entrée");
        while(!strLu.equals("")) {
            strLu = lireString("Appuyez sur Entrée");
        }
    }

    private void tester_afficherDesLignes() {
        afficherDesLignes(200);
    }

    private void afficherDesLignes(int nbLigne) {
        for (int noLigne = 1; noLigne <= nbLigne; noLigne++) { //comment faire pour arrêter disons aux 20 ligne pour attendre que l'utlisateu rappuie sur enter
            System.out.println("Ligne no " + noLigne);
            if ((noLigne % 20) == 0) {
                appuyerSurEnterPourContinuerVdoWhileLaMeilleur();
            }
        }
    }
    public void appuyerSurEnterPourContinuerVdoWhileLaMeilleur() {
        String strLu = "";

        do { // J'entre au moins une fois dans ma boucle
            strLu = lireString("Appuyez sur Entrée");
        } while(!strLu.equals("")); //La condition est vérifié après la première itération
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
        new Cours12_doWhile();
    }
}
