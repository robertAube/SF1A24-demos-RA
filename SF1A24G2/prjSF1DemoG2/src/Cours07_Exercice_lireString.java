public class Cours07_Exercice_lireString {
    //	Refaire lireEtAfficherPrenom et lire lireEtAfficherNom avec String lireString(String)
    public Cours07_Exercice_lireString() {
        lireEtAfficherNom();
//        lireEtAfficherPrenom();
    }

    private void lireEtAfficherNom() {
        String nom;

        nom = lireString("Quelle est votre nom?");

        System.out.println("Votre nom est " + nom);
    }

    public String lireString(String question){
        String reponse;
        // scanner
        // afficher question

        reponse = "reponse du scanner";

        return reponse;
    }

    public static void main(String[] args) {
        new Cours07_Exercice_lireString();
    }
}
