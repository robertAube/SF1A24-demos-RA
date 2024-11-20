package partie2.Cours21_tabDePizzas;

import java.util.Scanner;

public class Util {

    //static appartient à la classe (la classe existe toujours)
    //une méthode ne peut pas agir sur les variables d'instance (attribut) ou des méthodes d'instance
    public static int lireInt(String question) {
        String reponse;
        int reponseInt;

        reponse = lireString(question);
        reponseInt = Integer.parseInt(reponse);

        return reponseInt;
    }

    public static String lireString(String question) {
        String reponse;
        Scanner sc;

        sc = new Scanner(System.in);

        afficherQuestion(question);
        reponse = sc.nextLine();

        return reponse;
    }
    private static void classeEnveloppe() {
        Integer i = 4;
        i = 5;
        

    }

    private static void afficherQuestion(String question) {
        System.out.print(question);
    }
}
