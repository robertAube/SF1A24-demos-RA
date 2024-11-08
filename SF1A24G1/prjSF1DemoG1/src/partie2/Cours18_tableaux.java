package partie2;

public class Cours18_tableaux {
    public Cours18_tableaux() {
        //  tester_afficherTableau();
        tester_fusionnerTableau();
    }

    /*
    o	Écrire une méthode en Java qui reçoit 2 tableaux d’entiers et retourne un seul tableau fusionné.
    En d’autres mots, la méthode retourne un tableau qui contient les éléments du tableau reçu en premier
     argument suivit des éléments du tableau reçu en deuxième argument.
     */

    public int[] fusionnerTableau(int[] t1, int[] t2) {
        int[] tabFusion;
        int iTabFusion;

        tabFusion = new int[t1.length + t2.length];

        iTabFusion = 0;
        for (int i = 0; i < t1.length; i++) {
            tabFusion[iTabFusion++] = t1[i];
        }

        for (int i = 0; i < t2.length; i++) {
            tabFusion[iTabFusion++] = t2[i];
        }

        return tabFusion;
    }

    private void tester_fusionnerTableau() {
        int[] t1 = {5, 2, 4};
        int[] tf;
        tf = fusionnerTableau(t1, new int[]{6, -1});
        afficherTableau(tf);
    }

    public void afficherTableau(int[] tableau) {
        System.out.print('{');
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + (i + 1 == tableau.length ? "" : ", "));
        }
        System.out.println('}');
    }

    public void afficherTableauOld(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("tableau[" + i + "] = " + tableau[i]);
        }
    }

    public static void main(String[] args) {
        new Cours18_tableaux();
    }
}
