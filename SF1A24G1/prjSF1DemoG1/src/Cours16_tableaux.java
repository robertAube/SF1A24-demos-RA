public class Cours16_tableaux {
    public Cours16_tableaux() {
        jouerAvecTableau();
    }

    private void jouerAvecTableau() {
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

    public static void main(String[] args) {
        new Cours16_tableaux();
    }
}
