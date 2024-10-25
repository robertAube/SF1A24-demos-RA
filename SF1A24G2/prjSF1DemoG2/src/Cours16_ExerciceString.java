public class Cours16_ExerciceString {
    public Cours16_ExerciceString() {
        tester_get1LettreSur2();
    }

    private void tester_get1LettreSur2() {
        boolean estReussi = true;

        //    estReussi &= get1LettreSur2("").equals("");  // estReussi = estReussi && get1LettreSur2("").equals("");
        estReussi &= get1LettreSur2("Bonjour").equals("Bnor");  // estReussi = estReussi && get1LettreSur2("").equals("");

        System.out.println("get1LettreSur2(): " + (estReussi ? "OK" : "Erreur de logique"));
    }

    /*
    o	Écrire une méthode get1LettreSur2 qui reçoit en argument une String et retourne une String contenant les lettres
    aux positions paires de la String reçu en argument.
     */

    public String get1LettreSur2(String str) {
        String str1LettreSur2 = "";

        for (int i = 0; i < str.length(); i += 2) {
            str1LettreSur2 += str.charAt(i);
        }

        return str1LettreSur2;
    }


    public static void main(String[] args) {
        new Cours16_ExerciceString();
    }
}
