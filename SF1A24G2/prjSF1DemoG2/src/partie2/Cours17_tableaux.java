package partie2;

public class Cours17_tableaux {
    public Cours17_tableaux() {
        //  tester_afficherTableau();
        tester_fusionnerTableau();
    }

    private void tester_fusionnerTableau() {
        afficherTableau(fusionnerTableau(new int[]{1, 2}, new int[]{3, 4, 5}));
        afficherTableau(fusionnerTableau(new int[]{}, new int[]{}));
        afficherTableau(fusionnerTableau(new int[]{}, new int[]{1, 3}));
    }

    private int[] fusionnerTableau(int tab1[], int tab2[]) {
        int[] tabFusion;
        int iFusion;

        tabFusion = new int[tab1.length + tab2.length];

        iFusion = 0;
        for (int i = 0; i < tab1.length; i++) {
            tabFusion[iFusion++] = tab1[i];
        }
        for (int i = 0; i < tab2.length; i++) {
            tabFusion[iFusion++] = tab2[i];
        }

        return tabFusion;
    }

    private void tester_afficherTableau() {
        afficherTableau(new int[]{1, 3, 4});
        afficherTableau(new int[]{});
    }

    /*
    o	Écrire une méthode en Java qui reçoit 2 tableaux d’entiers et retourne un seul tableau fusionné.
    En d’autres mots, la méthode retourne un tableau qui contient les éléments du tableau reçu en premier
     argument suivit des éléments du tableau reçu en deuxième argument.
     */

    public void afficherTableau(int[] tableau) {
        System.out.print("{");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + ((i == tableau.length - 1) ? "" : ", "));
        }
        System.out.println("}");
    }


    public static void main(String[] args) {
        new Cours17_tableaux();
    }
}
