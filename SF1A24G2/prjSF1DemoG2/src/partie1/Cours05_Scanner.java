package partie1;

import java.util.Scanner; //Impore la libraire qui ne fait pas partie du langage de base de java.

public class Cours05_Scanner {
    public Cours05_Scanner() {
        lireEtAfficherNom();
        lireEtAfficherPrenom();
    }

    private void lireEtAfficherPrenom() {
        String prenom;
        Scanner sc; //Variable de type Scanner (classe utilitaire de lecture)
        sc = new Scanner(System.in); //Instanciation de l'utilitaire de lecture.  System.in = entrée standard (clavier)

        System.out.print("Entrez le prénom: ");
        prenom = sc.nextLine(); //attendre que l'usager entre des caractères au clavier et appuie sur retour. nextLine() retourne la String saisie.
        System.out.println("Votre prénom est " + prenom + '.');
    }

    private void lireEtAfficherNom() {
        String nom;
        Scanner sc; //Variable de type Scanner (classe utilitaire de lecture)
        sc = new Scanner(System.in); //Instanciation de l'utilitaire de lecture.  System.in = entrée standard (clavier)

        System.out.print("Entrez le nom: ");
        nom = sc.nextLine(); //attendre que l'usager entre des caractères au clavier et appuie sur retour. nextLine() retourne la String saisie.
        System.out.println("Votre nom est " + nom + '.');
    }

    public static void main(String[] args) {
        new Cours05_Scanner();
    }
}
