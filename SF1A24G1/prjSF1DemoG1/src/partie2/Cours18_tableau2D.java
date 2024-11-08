package partie2;

public class Cours18_tableau2D {
    public Cours18_tableau2D() {
        jouerAvecTableauTableau2D();
    }

    private void jouerAvecTableauTableau2D() {
        String[][] tab2DString;
        int[][] tab2Dint = {{1, 4, 2}, {7, 4}};

        tab2DString = new String[3][2];

        for (int ligne = 0; ligne < tab2DString.length; ligne++) {
            for (int colonne = 0; colonne < tab2DString[ligne].length; colonne++) {
                tab2DString[ligne][colonne] = "[" + ligne + ", " + colonne + "]";
            }
        }
        afficherTableau(tab2DString);
        afficherTableau(tab2Dint);
    }

    public void afficherTableau(String[][] tab2D) {
        for (int ligne = 0; ligne < tab2D.length; ligne++) {
            afficherTableau(tab2D[ligne]);
        }
    }
    public void afficherTableau(int[][] tab2D) {
        for (int ligne = 0; ligne < tab2D.length; ligne++) {
            afficherTableau(tab2D[ligne]);
        }
    }
    public void afficherTableau(int[] tableau) {
        System.out.print('{');
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + (i + 1 == tableau.length ? "" : ", "));
        }
        System.out.println('}');
    }

    public void afficherTableau(String[] tableau) {
        System.out.print('{');
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + (i + 1 == tableau.length ? "" : ", "));
        }
        System.out.println('}');
    }


    public void afficherTableauOld(String[][] tab2D) {
        for (int ligne = 0; ligne < tab2D.length; ligne++) {
            for (int colonne = 0; colonne < tab2D[ligne].length; colonne++) {
                System.out.print(tab2D[ligne][colonne] + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Cours18_tableau2D();
    }
}
