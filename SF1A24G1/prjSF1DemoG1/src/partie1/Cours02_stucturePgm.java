package partie1;//Nom de la classe doit être le même que le nom de fichier en Java et que le constructeur.
//Le nom de la classe commence toujours avec une Majuscule
//On capitalise toujours les noms de classe Majuscule à chaque début de mot

public class Cours02_stucturePgm {
    // ALT-Inser pour créer le constucteur.
    //Le constructeur est toujours la première méthode
    public Cours02_stucturePgm() {
        System.out.println("Début du constructeur");

        System.out.print("Mon prénom est : ");
        afficherPrenom();
        System.out.print("\nMon nom est : "); //Le \n est un caractère spécial qui affiche un saut de ligne
        afficherNom();

        System.out.print("\nMon prénom et mon nom est : " );
        afficherPrenomEtNom();
        System.out.println();

        System.out.println("Fin du constructeur");
    }

    private void afficherPrenomEtNom() {
        afficherPrenom();
        System.out.print(" ");
        afficherNom();
    }

    private void afficherNom() {
        System.out.print("Fortin");
    }

    private void afficherPrenom() {
        System.out.print("Robert");
    }

    //Toujours placer le main à la fin
    public static void main(String[] args) { //C'est ici que le programme commence
        System.out.println("Début du programme");
        new Cours02_stucturePgm(); //instancier ma classe (son nom est partie1.Cours02_stucturePgm)
        //Le constructeur ma classe est appelé.
        System.out.println("Fin du programme");
    }
}
