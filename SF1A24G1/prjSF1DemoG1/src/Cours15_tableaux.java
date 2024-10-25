public class Cours15_tableaux {
    public Cours15_tableaux() {
        jouerAvecTableau();
    }

    private void jouerAvecTableau() {
        int[] notes; //Declaration d'un tableau int

        notes = new int[4]; //initialise la variable 'notes' avec l'instanciation d'un tableau de 4 éléments de type int.

        notes[0] = 97; //Affecter la valeur à l'indice 0.
        notes[1] = 68; //Affecter la valeur à l'indice 0.
        notes[2] = 77; //Affecter la valeur à l'indice 0.
        notes[3] = 100; //Affecter la valeur à l'indice 0.
       // notes[4] = 100; //java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4

        for (int i = 0; i < notes.length; i++) {
            System.out.println("note[" + i + "] = " + notes[i]);
        }
    }

    public static void main(String[] args) {
        new Cours15_tableaux();
    }
}
