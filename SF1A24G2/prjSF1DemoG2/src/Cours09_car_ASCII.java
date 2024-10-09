public class Cours09_car_ASCII {
    public Cours09_car_ASCII() {
        jouerAvecChar();
    }

    private void jouerAvecChar() {
        char lettre; //char un type pour contenir des caractères

//        lettre = "a"; //On ne peut pas mettre une chaîne dans un char
//        lettre = ''; //On ne peut pas mettre une chaîne dans un char
        lettre = 'a';
        System.out.println(lettre);  //affiche a

        System.out.println("canad" + lettre); // affiche canada

        System.out.println((int) lettre); //affiche 97
        System.out.println((char) 97); //affiche a
        System.out.println((char) 98); //affiche b
        System.out.println((char) 0x2f); //affiche / (0x indique que 2f est en base 16)
        System.out.println('a' < 'x'); //affiche true
        System.out.println('a' == 'A'); //affiche false
        System.out.println('a' < 'A'); //affiche faux (97 < 65)
    }

    public static void main(String[] args) {
        new Cours09_car_ASCII();
    }
}
