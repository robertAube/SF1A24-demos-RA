public class Cours07_String {
    public Cours07_String() {
        //jouerAvecChaineDeCaracteres()
        //jouerAvecCaracteresSpeciaux();

        //System.out.println(getStrEntreGuillemets("Bonjour"));

        //jouerAvecLaLongueurDUneString();

        //tester_getStrMinuscule_getStrMajuscule();

        tester_getCharALIndice();
    }

    private void tester_getCharALIndice() {
        String str = "Bonjour Le Monde";
        char c;
        int indice = 0;

        c = gerCharALIndice(str, indice);
        System.out.println("Le caractère à l'indice " + indice + " de la chaine " + getStrEntreGuillemets(str) + " est " + c);

        indice = 1;
        c = gerCharALIndice(str, indice);
        System.out.println("Le caractère à l'indice " + indice + " de la chaine " + getStrEntreGuillemets(str) + " est " + c);

        indice = 15;
        c = gerCharALIndice(str, indice);
        System.out.println("Le caractère à l'indice " + indice + " de la chaine " + getStrEntreGuillemets(str) + " est " + c);

        indice = -1;
        c = gerCharALIndice(str, indice);
        System.out.println("Le caractère à l'indice " + indice + " de la chaine " + getStrEntreGuillemets(str) + " est " + c);
    }

    private char gerCharALIndice(String str, int indice) {
        char charALIndex; //char à l'index d'une String

        charALIndex = str.charAt(indice);

        return charALIndex;
    }

    private void tester_getStrMinuscule_getStrMajuscule() {
        String str;

        str = "\tBonjour Le Monde - 1234$$$ \"";
        System.out.println(getStrMinuscule(str));
        System.out.println(getStrMajuscule(str));
    }

    private String getStrMajuscule(String str) {
        String strMajuscule;

        strMajuscule = str.toUpperCase();//la méthode toUpperCase retourne la str en majuscule
        return strMajuscule;
    }

    private String getStrMinuscule(String str) {
        String strMinuscule;

        strMinuscule = str.toLowerCase(); //la méthode toLowerCase retourne la str en minuscule
//        System.out.println(str); //str n'est pas en minuscule. Elle demeure intact.
        return strMinuscule;
    }


    private void jouerAvecLaLongueurDUneString() {
        String str;
        int longueurStr;

        str = "";
        longueurStr = str.length(); //la méthode length() retourne la longueur d'une String
        System.out.println(getStrEntreGuillemets(str) + " a une longueur de " + longueurStr);


        str = " 1234!abc ";
        longueurStr = str.length(); //la méthode length() retourne la longueur d'une String
        System.out.println(getStrEntreGuillemets(str) + " a une longueur de " + longueurStr);
    }


    private String getStrEntreGuillemets(String str) {
        String strEntreGuillemets;

        strEntreGuillemets = '"' + str + '"';

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
        str = '"' + "Bonjour" + '"'; // ' ' est une constante de 1 caractère
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
