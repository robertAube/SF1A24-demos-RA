package partie2;

public class Cours15_tableaux {
    public Cours15_tableaux() {
//        jouerAvecTableauV1();
        jouerAvecTableauV2();
    }

    private void jouerAvecTableauV1() {
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

        afficherTableau(notes);
    }

    private void jouerAvecTableauV2() {
        int[] notes = {96, 56, 88}; //Déclaration d'un tableau de int qui fait référence à un tableau de longueur 3 avec 3 notes. (96, 56, 88)
        int majoration = 1;
        String a = "";

        a = "qq";

        afficherTableau(notes);
        ajouterPoints(notes, majoration);
        afficherTableau(notes);
        System.out.println("dans jouerAvecTableauV2: " + majoration); //majoration n'Est pas changé

        notes = creerTableau(2, 100);

        afficherTableau(notes);
    }

    public void ajouterPoints(int[] notes, int majoration) {
        for (int i = 0; i < notes.length; i++) {
            notes[i] += majoration;
        }
        majoration += 1;
        System.out.println("dans ajouterPoints: " + majoration);
    }

    public int[] creerTableau(int longueurTableau, int valInitiale) {
        int[] tableau;

        tableau = new int[longueurTableau];

        for (int i = 0 ; i < longueurTableau; i++) {
            tableau[i] = valInitiale;
        }

        return tableau;
    }

    public void afficherTableau(int[] tableau) {
        for (int i =0 ; i < tableau.length; i++) {
            System.out.println("tableau[" + i + "] = " + tableau[i]);
        }
    }

    public static void main(String[] args) {
        new Cours15_tableaux();
    }
}
