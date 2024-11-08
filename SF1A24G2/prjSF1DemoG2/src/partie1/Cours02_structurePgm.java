package partie1;

public class Cours02_structurePgm {
    //Nom du fichier doit être égal au nom de la classe et au nom du constructeur. Même casse (minuscule et majuscule)
    //C'est le constructeur. Pour le créer, placez-vous dans la classe et appuyez sur ALT-Inser et choisir Constructor
    //Le nom du constructeur d'une classe doit être le même que la classe
    public Cours02_structurePgm() {
        System.out.println("Début constructeur");
        System.out.println("Mon nom est Robert Aubé");
        afficherMonNom();
        System.out.println("Fin constructeur");
    }

    private void afficherMonNom() {
        System.out.println("Mon nom est Robert Aubé");
        afficherProfession();
    }

    private void afficherProfession() {
        System.out.println("Ma profession est enseignant");
    }

    public static void main(String[] args) { //C'est ici que le programme commence
        System.out.println("Début du programme");
        new Cours02_structurePgm(); //instancie ma classe (son nom c'est partie1.Cours02_calculs). Donc j'appelle le constructeur.
        System.out.println("Fin du programme");
    }
}


