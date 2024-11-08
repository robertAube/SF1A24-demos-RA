package partie2.Cours19_objet;

import java.util.Scanner;

public class Util {
    public static int lireInt(String question) {
        return Integer.parseInt(lireString(question));
    }

    // lireString est une méthode de classe. Ne fait référence à aucun attribut. Cette méthode est static.
    public static String lireString(String question) {
        String reponse;
        Scanner sc;

        sc = new Scanner(System.in);

        afficherQuestion(question);
        reponse = sc.nextLine();

        return reponse;
    }

    private static void afficherQuestion(String question) {
        System.out.print(question);
    }
}
