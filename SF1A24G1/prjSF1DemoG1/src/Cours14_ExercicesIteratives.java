public class Cours14_ExercicesIteratives {
    public Cours14_ExercicesIteratives() {
        //      tester_inverserString();
        tester_getStringCarre();
    }

    //CTRL-/ pour commenter et décommenter
    public void tester_inverserString() {
        System.out.println(inverserString("abC").equals("Cba"));
        System.out.println(inverserString("").equals(""));
        System.out.println(inverserString("54321 $%?").equals("?%$ 12345"));
    }

    public String inverserString(String str) {
        String strInverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            strInverse += str.charAt(i);
        }

        return strInverse;
    }


    private void tester_getStringCarre() {
        System.out.println("getStringCarre(1)\n" + getStringCarre(1));
        System.out.println("getStringCarre(2)\n" + getStringCarre(2));
        System.out.println("getStringCarre(3)\n" + getStringCarre(3));
    }


    public String getStringCarre(int dimension) {
        String str = "";

        //faire toutes les lignes
        for (int ligne = 1; ligne <= dimension; ligne++) {
            //faire une ligne
            for (int col = 1; col <= dimension; col++) { // boucle imbriquée
                str += "" + col + ligne + (col == dimension ? "":" ");
            }
            str += '\n';
        }

        return str;
    }

//     11 21 31
//     12 22 32
//     13 23 33


    public static void main(String[] args) {
        new Cours14_ExercicesIteratives();
    }
}
