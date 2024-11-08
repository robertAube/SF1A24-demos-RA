package partie1;

public class Cours03_parametres {
    //ALT-Insert
    public Cours03_parametres() {

        flkdsjflkaf(3);
        tester_afficher_additionDeNombres();
    }

    private void flkdsjflkaf(int i) {

    }

    private void tester_afficher_additionDeNombres() {
        afficher_additionDeNombres(6, 2);
        afficher_additionDeNombres(16, 4);
        afficher_additionDeNombres(2, 4);
        afficher_additionDeNombres(6, -2);
    }


    //Cette méthode reçoit 2 paramètres de type entier.
    //Ces 2 paramètres sont des variables locales.
    //La valeur du premier paramètre est initialisé avec la valeur envoyée comme premier paramètre.
    //La valeur du deuxième paramètre est initialisé avec la valeur envoyée comme deuxième paramètre.
    private void afficher_additionDeNombres(int nb1, int nb2) {
        int somme; //variable local de type entier

        somme = nb1 + nb2;

        System.out.println("La somme de " + nb1 + " et " + nb2 + " est " + somme);
    }

    public static void main(String[] args) {
        new Cours03_parametres();
    }
}
