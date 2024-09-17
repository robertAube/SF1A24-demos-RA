public class Cours06_exercice {
    public Cours06_exercice() {
        tester_afficherPerimetreCarre();
    }

    //    o	Écrire une méthode calculerPerimetreCarre qui reçoit en argument la dimension d’un carré (un entier) et qui retourne son périmètre.
    private int calculerPerimetreCarre(int dimCote) { //Une méthode calculer ne fait jamais d'affichage
        int perimetre;

        perimetre = 4 * dimCote;

        return perimetre;
    }


    //    o	Écrire une méthode afficherPerimetreCarre qui reçoit en argument la dimension d’un carré (un entier) et qui affiche son périmètre.
    private void afficherPerimetreCarre(int dimCote) { //signature de méthode
        String str;

        str = "Le perimètre d'un carré dont les côtés sont de " + dimCote;
        str += " est de " + calculerPerimetreCarre(dimCote) + '.'; //+= ajouter à la String str
        System.out.println(str);
    }

    //    o	Écrire une méthode tester_afficherPerimetreCarre qui teste 5 fois afficherPerimetreCarre.
    private void tester_afficherPerimetreCarre() {
        afficherPerimetreCarre(5);
        afficherPerimetreCarre(0);
        afficherPerimetreCarre(-5);
        afficherPerimetreCarre(2);
        afficherPerimetreCarre(9);
    }

    public static void main(String[] args) {
        new Cours06_exercice();
    }
}
