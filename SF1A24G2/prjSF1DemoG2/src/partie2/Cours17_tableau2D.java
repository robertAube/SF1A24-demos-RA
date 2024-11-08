package partie2;

public class Cours17_tableau2D {
    public Cours17_tableau2D() {
        jouerAvecTableauTableau2D();
    }

    private void jouerAvecTableauTableau2D() {
        int[][] matrice = {{1, 2, 3}, {-1, 3, 8}, {12, 1, -16}, {5, 1, 2}};

        afficherTableau(matrice);
        matrice[1][0] = - matrice[1][0];
        afficherTableau(matrice);
    }


    public void afficherTableau(int[][] matrice) { //surcharge de méthode : même nom de méthode et signature différente
        System.out.print("{");
        for (int ligne = 0; ligne < matrice.length; ligne++) {
            afficherTableau(matrice[ligne]);
            System.out.print((ligne == matrice.length - 1) ? "" : ", ");
        }
        System.out.println("}");
    }

    public void afficherTableau(int[] tableau) { //surcharge de méthode : même nom de méthode et signature différente
        System.out.print("{");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + ((i == tableau.length - 1) ? "" : ", "));
        }
        System.out.print("}");
    }


    public void afficherTableauV1(int[][] matrice) {
        for (int ligne = 0; ligne < matrice.length; ligne++) {
            for (int colonne = 0; colonne < matrice[ligne].length; colonne++) {
                System.out.print(matrice[ligne][colonne] + ", ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new Cours17_tableau2D();
    }
}
