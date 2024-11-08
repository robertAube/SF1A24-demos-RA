package partie1;

public class Cours07_Exercice_lireString {
    public Cours07_Exercice_lireString() {
        lireEtAfficherNom();
        // lireEtAfficherPrenom();
    }

    private void lireEtAfficherNom() {
        String nom;

        nom = lireString("Quelle est ton nom? ");

        System.out.println("Votre nom est " + nom + '.');
    }

    private void lireEtAfficherPrenom() {
        String prenom;

        prenom = lireString("Quelle est ton prénom? ");

        System.out.println("Votre nom est " + prenom + '.');
    }
    public String lireString(String question) {
        String reponse;
        System.out.print(question);
        reponse = "Reponse lu par le scanner";

        return reponse;
    }

    public static void main(String[] args) {
        new Cours07_Exercice_lireString();
    }
}
