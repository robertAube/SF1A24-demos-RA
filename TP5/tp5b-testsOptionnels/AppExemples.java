package _tp5EnseignantA24;

import _tp5EnseignantA24.paquet.Carte;

public class AppExemples {
    private Partie21 p;
    private String explication;
    private int noPhase;
    private int noExemple;
    private String saisieJoueur = "";

    private void exemple1() {
        noExemple = 1;
        noPhase = 1;
        explication = "Le joueur a 21 en commençant et gagne! La partie est terminée.";
        Carte[] jeu = {
                //banquier
                new Carte(1, "pique"),
                new Carte(8, "pique"),
                //votre jeu
                new Carte(10, "pique"),
                new Carte(1, "carreau")
        };
        jouer(jeu);
    }


    private void exemple2() {
        noExemple = 2;
        noPhase = 1;
        explication = "Le banquier a 21 en commençant et gagne! La partie est terminée.";
        Carte[] jeu = {
                //banquier
                new Carte(10, "pique"),
                new Carte(1, "carreau"),

                //votre jeu
                new Carte(1, "pique"),
                new Carte(8, "pique"),
        };
        jouer(jeu);
    }

    private void exemple3() {
        noExemple = 3;
        noPhase = 1;
        explication = "Tout le monde dépasse 21. Tout le monde perd.";
        Carte[] jeu = {
                //banquier
                new Carte(1, "pique"),
                new Carte(1, "trèfle"),

                //votre jeu
                new Carte(1, "carreau"),
                new Carte(1, "coeur"),
        };
        jouer(jeu);
    }

    private void exemple4() {
        noExemple = 4;
        noPhase = 1;
        explication = "Le banquier perd en commençant en dépassant 21. (il a pigé 2 as)";
        Carte[] jeu = {
                //banquier
                new Carte(1, "coeur"),
                new Carte(1, "trèfle"),

                //votre jeu
                new Carte(9, "carreau"),
                new Carte(10, "coeur"),
        };
        jouer(jeu);
    }

    private void exemple5() {
        noExemple = 5;
        noPhase = 1;
        explication = "Le joueur perd en commençant en dépassant 21. (il a pigé 2 as)";
        Carte[] jeu = {
                //banquier
                new Carte(9, "carreau"),
                new Carte(10, "coeur"),

                //votre jeu
                new Carte(1, "coeur"),
                new Carte(1, "trèfle"),
        };
        jouer(jeu);
    }

    private void exemple6() {
        noExemple = 6;
        noPhase = 1;
        explication = "Le joueur et le banquier gagnent au début.";

        Carte[] jeu = {
                //banquier
                new Carte(1, "pique"),
                new Carte(10, "coeur"),

                //votre jeu
                new Carte(10, "carreau"),
                new Carte(1, "coeur"),
        };
        jouer(jeu);
    }

    private void exemple7() { //joueur entre : dc
        noExemple = 7;
        noPhase = 3;
        explication = "Le joueur demande des cartes jusqu’à dépasser 21.";
        saisieJoueur = "ddd";

        Carte[] jeu = {
                //banquier
                new Carte(3, "pique"),
                new Carte(2, "carreau"),
                //votre jeu
                new Carte(9, "coeur"),
                new Carte(4, "trèfle"),

                //joueur pige
                new Carte(5, "pique"),
                new Carte(2, "pique"),
                new Carte(10, "trèfle")
        };
        jouer(jeu);
    }

    private void exemple8() {
        noExemple = 8;
        noPhase = 4;
        explication = "Le banquier gagne: votre main ne dépasse pas celle du banquier.";
        saisieJoueur = "dc";

        Carte[] jeu = {
                //banquier
                new Carte(3, "pique"),
                new Carte(2, "carreau"),
                //votre jeu
                new Carte(9, "coeur"),
                new Carte(4, "trèfle"),

                //joueur pige
                new Carte(5, "pique"),

                //banquier pige
                new Carte(6, "carreau"),
                new Carte(9, "trèfle")
        };
        jouer(jeu);
    }

    private void exemple9() {
        noExemple = 9;
        noPhase = 4;
        explication = "Le banquier perd parce qu’il a dépassé 21.";
        saisieJoueur = "dc";

        Carte[] jeu = {
                //banquier
                new Carte(3, "pique"),
                new Carte(2, "carreau"),
                //votre jeu
                new Carte(9, "coeur"),
                new Carte(4, "trèfle"),

                //joueur pige
                new Carte(5, "pique"),

                //banquier pige
                new Carte(8, "carreau"),
                new Carte(10, "trèfle")
        };
        jouer(jeu);
    }

    private void exemple10() {
        noExemple = 10;
        noPhase = 4;
        explication = "Le banquier gagne : le joueur a conservé son jeu alors que son jeu est d’une valeur égale au banquier.";
        saisieJoueur = "dc";

        Carte[] jeu = {
                //banquier
                new Carte(13, "pique"),
                new Carte(7, "carreau"),
                //votre jeu
                new Carte(3, "pique"),
                new Carte(9, "carreau"),

                //joueur pige
                new Carte(5, "pique"),

                //banquier pige
                new Carte(2, "trèfle")
        };
        jouer(jeu);
    }


    public AppExemples() {
        exemple1();
        exemple2();
        exemple3();
        exemple4();
        exemple5();
        exemple6();
        exemple7();
        exemple8();
        exemple9();
        exemple10();
    }

    private void jouer(Carte[] jeu) {
        String str = "";
        str += "+++ Exemple " + noExemple + " ++++++++++++++++++++++++++++++++++++++++++\n";
        str += "+++ Phase " + noPhase + " du jeu\n";
        str += "+++ " + explication + '\n';
        str += saisieJoueur.equals("") ? "" : "Saisie de l'usager : " + saisieJoueur + '\n';
        System.out.print(str);

        p = new Partie21(jeu);
        p.jouer();

        System.out.println();
        saisieJoueur = "";
    }

    public static void main(String[] args) {
        new AppExemples();
    }

}
