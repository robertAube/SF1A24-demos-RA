package partie1;

public class Cours07_String {
    public Cours07_String() {
//        jouerAvecChaineDeCaracteres();
//        jouerAvecCaracteresSpeciaux();
//        afficherLaLongeurDUneString();
//        tester_getMinuscule_getMajuscule();
        tester_getCharALIndice();
    }

    private void tester_getCharALIndice() {
        String str = "Bonjour Le Monde";
        char c;
        int i = 0;

        c = getCharALIndice(str, i);
        System.out.println("Le caractère à l'indice " + i + " de la chaine " + getStrEntreGuillemets(str) + " est " + c);

        i = 1;
        c = getCharALIndice(str, i);
        System.out.println("Le caractère à l'indice " + i + " de la chaine " + getStrEntreGuillemets(str) + " est " + c);

        i = 15;
        c = getCharALIndice(str, i);
        System.out.println("Le caractère à l'indice " + i + " de la chaine " + getStrEntreGuillemets(str) + " est " + c);

        i = -1;
        c = getCharALIndice(str, i);
        System.out.println("Le caractère à l'indice " + i + " de la chaine " + getStrEntreGuillemets(str) + " est " + c);
    }

    private void tester_getMinuscule_getMajuscule() {
        String str;

        str = "\tBonjour Le Monde - 1234$$$ \"";
        System.out.println(getMinuscule(str));
        System.out.println(getMajuscule(str));
    }

    private char getCharALIndice(String str, int index) {
        char charALIndex; //char à l'index d'une String

        charALIndex = str.charAt(index);

        return charALIndex;
    }

    private String getMajuscule(String str) {
        String strMajuscule;

        strMajuscule = str.toUpperCase(); //la méthode toUpperCase retourne la str en majuscule

        return strMajuscule;
    }

    private String getMinuscule(String str) {
        String strMinuscule;

        strMinuscule = str.toLowerCase(); //la méthode toLowerCase retourne la str en minuscule
//        System.out.println(str); //str n'est pas en minuscule. Elle demeure intact.
        return strMinuscule;
    }

    private void afficherLaLongeurDUneString() {
        String str = "";
        int longueurStr;

        longueurStr = str.length(); //la méthode length() retourne la longueur d'une String

        System.out.println(getStrEntreGuillemets(str) + " a une longueur de " + longueurStr);

        str = " Bonjour  ";
        longueurStr = str.length();
        System.out.println(getStrEntreGuillemets(str) + " a une longueur de " + longueurStr);
    }

    private String getStrEntreGuillemets(String str) {
        String strEntreGuillemets;
        strEntreGuillemets = '"' + str + "\""; // '"' : caractère guillemets
        return strEntreGuillemets;
    }

    private void jouerAvecCaracteresSpeciaux() {
        String str = "";

        str = "Bonjour\nle\nmonde."; // \n un retour à la ligne
        System.out.println(str);
        str = "Bonjour\tle\tmonde."; // \t est une tabulation
        System.out.println(str);
        str = "\\t est le caractère de tabulation."; // \ est le caractère d'échappement (affiche \t
        System.out.println(str);
        str = "\"Bonjour\""; // \" pour afficher des guillemets
        System.out.println(str);
    }

    private void jouerAvecChaineDeCaracteres() {
        String str;
        str = "Bonjour";

        System.out.println(str); //affiche : Bonjour
        System.out.println(str + " le "); //affiche : Bonjour le
        System.out.println(str); //affiche : Bonjour
        str = str + " le";
        System.out.println(str); //affiche : Bonjour le
        str += " monde."; //on préfère cette syntaxe pour ajouter à une chaîne.
        System.out.println(str); //affiche : Bonjour le monde
    }

    public static void main(String[] args) {
        new Cours07_String();
    }
}
