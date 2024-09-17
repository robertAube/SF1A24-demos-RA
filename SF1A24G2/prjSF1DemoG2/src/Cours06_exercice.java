public class Cours06_exercice {
    public Cours06_exercice() {
        tester_afficherPerimetreCarre();
    }
//    Écrire une méthode calculerPerimetreCarre qui reçoit en argument la dimension d’un carré (un entier) et qui retourne son périmètre.

    private int calculerPerimetreCarre(int lgCote) { //signature de la méthode
        int perimetre; //variable de retour

        perimetre = lgCote * 4;

        return perimetre;
    }

//    Écrire une méthode afficherPerimetreCarre qui reçoit en argument la dimension d’un carré (un entier) et qui affiche son périmètre.
    private void afficherPerimetreCarre(int lgCote) {
        String str;

        str = "Le perimtre d'un carré dont les côtés ont une longueur de ";
        str += lgCote;
        str += " ont un perimètre de " + calculerPerimetreCarre(lgCote) + ".\n" ; //\n est le caractère spécial de saut de ligne

        System.out.println(str);
    }
//
//    Écrire une méthode tester_afficherPerimetreCarre qui teste 5 fois afficherPerimetreCarre.
    private void tester_afficherPerimetreCarre() {
        afficherPerimetreCarre(0);
        afficherPerimetreCarre(-10);
        afficherPerimetreCarre(28329);
        afficherPerimetreCarre(4);
        afficherPerimetreCarre(18);
    }


    public static void main(String[] args) {
        new Cours06_exercice();
    }
}
