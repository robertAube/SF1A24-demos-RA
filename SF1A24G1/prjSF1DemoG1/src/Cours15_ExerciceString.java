public class Cours15_ExerciceString {
    public Cours15_ExerciceString() {
        tester_get1LettreSur2();
    }

    private void tester_get1LettreSur2() {
        boolean estReussi = true;

        estReussi &= get1LettreSur2("").equals(""); // comme estReussi = estReussi && get1LettreSur2("").equals("")
        estReussi &= get1LettreSur2("Bonjour").equals("Bnor");

        System.out.println("get1LettreSur2(): " + (estReussi ? "OK" : "Erreur de logique"));
    }

    private String get1LettreSur2(String str) {
        String strCarPair = "";

        for (int i = 0; i < str.length(); i += 2) {
            strCarPair += str.charAt(i);
        }

        return strCarPair;
    }

    /*
    o	Écrire une méthode get1LettreSur2 qui reçoit en argument une String et retourne une String contenant les lettres
    aux positions paires de la String reçu en argument.
     */
    public static void main(String[] args) {
        new Cours15_ExerciceString();
    }
}
