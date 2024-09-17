import java.util.Scanner;

public class Cours06_scanner {
    public Cours06_scanner() {
        lireEtAfficherNom();
        lireEtAfficherPrenom();
    }

    private void lireEtAfficherNom() {
        String nom;

        Scanner sc; //Variable de type Scanner
        sc = new Scanner(System.in); //Instanciation de l'utilitaire de lecture. System.in = entrée standard (clavier)

        System.out.print("Donner votre nom : ");
        nom = sc.nextLine(); //Attendre que l'usager entre des caractères au clavier et qu'il appuie sur retour. nextLine() retourn la String saisie avant le retour

        System.out.println("Votre nom est " + nom + '.');
    }

    private void lireEtAfficherPrenom() {
        String prenom;

        Scanner sc; //Variable de type Scanner
        sc = new Scanner(System.in); //Instanciation de l'utilitaire de lecture. System.in = entrée standard (clavier)

        System.out.print("Donner votre prénom : ");
        prenom = sc.nextLine(); //Attendre que l'usager entre des caractères au clavier et qu'il appuie sur retour. nextLine() retourn la String saisie avant le retour

        System.out.println("Votre prénom est " + prenom + '.');
    }


    public static void main(String[] args) {
        new Cours06_scanner();
    }
}
