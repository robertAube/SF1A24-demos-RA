public class Cours02_parametres {
    public Cours02_parametres() {
        tester_afficherLeNombreRecuEnParametre();
        tester_additionDeNombres();
    }

    private void tester_additionDeNombres() {
        afficher_additionDeNombres(6, 2);
        afficher_additionDeNombres(2, 7);
    }

    //Chaque variable est affectée selon sa position
    private void afficher_additionDeNombres(int nb1, int nb2) {
        int somme; //variable local

        somme = nb1 + nb2;

        System.out.println("La somme de " + nb1 + " et " + nb2 + " est " + somme);
    }

    private void tester_afficherLeNombreRecuEnParametre() {
        afficherLeNombreRecuEnParametre(6);
        afficherLeNombreRecuEnParametre(1);
        afficherLeNombreRecuEnParametre(-4);
        afficherLeNombreRecuEnParametre(555);
        afficherLeNombreRecuEnParametre(16);
    }

    //Cette méthode reçoit un paramètre de type entier
    private void afficherLeNombreRecuEnParametre(int nb) {
        System.out.println("Le nombre reçu en paramètre (ou en argument) est " + nb + ".");
    }


    public static void main(String[] args) {
        new Cours02_parametres();
    }
}
