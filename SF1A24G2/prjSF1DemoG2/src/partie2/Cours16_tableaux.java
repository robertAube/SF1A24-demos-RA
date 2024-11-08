package partie2;

public class Cours16_tableaux {
    public Cours16_tableaux() {
//        jouer1AvecTableau();
        jouer2AvecTableau();
    }

    private void jouer1AvecTableau() {
        int[] notes; //Déclaration d'un tableau de int

        notes = new int[4]; //initialisation de la variable 'notes' avec l'instance d'un tableau de 4 éléments de type int

        notes[0] = 97; //Affecter la valeur à l'indice 0
        System.out.println(notes[0]);
        notes[1] = 68; //Affecter la valeur à l'indice 1
        notes[2] = 77; //Affecter la valeur à l'indice 2
        notes[3] = 100; //Affecter la valeur à l'indice 3
        //  notes[4] = 100; //java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4

        //parcourir le tableau et afficher le contenu
        for (int i = 0; i < notes.length; i++) {
            System.out.println("notes[" + i + "] = " + notes[i]);
        }
    }

    private void jouer2AvecTableau() {
        int[] notes = {97, 76}; //Déclaration d'un tableau de int qui fait référenc à un tableau 'une longueur de 2 avec les notes 97 et 76

        notes[0] = 100; //

        //notes[2] = 100; //java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4

        afficherTableau(notes);
        ajouterTableau(notes, 1);
        afficherTableau(notes);

        int nbEtudiant = 6;
        int noteInitiale = 60;

        notes = creerTableau(nbEtudiant, noteInitiale);

        afficherTableau(notes);
    }

    public int[] creerTableau(int longueurTableau, int valInitale) {
        int[] tableau;

        tableau = new int[longueurTableau];

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = valInitale;
        }

        return tableau;
    }

    public void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("tableau[" + i + "] = " + tableau[i]);
        }
    }

    public void ajouterTableau(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] += valeur;
        }
    }

    public static void main(String[] args) {
        new Cours16_tableaux();
    }
}
