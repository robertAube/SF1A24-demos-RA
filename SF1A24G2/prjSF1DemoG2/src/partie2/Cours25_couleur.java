package partie2;

import _util.CouleurConsole;

public class Cours25_couleur {
    public Cours25_couleur() {
        System.out.println( CouleurConsole.BLUE_BOLD + "Un chasseur sachant chasser sait chasser sans son chien est un bon chasseur.");
        System.out.println( "Qui sont ces six singes suisses?" + CouleurConsole.RESET);
        System.out.println( "Seize jacinthes sèchent dans seize sachets sales.");
        System.out.println( CouleurConsole.GREEN_UNDERLINED +  "Suis-je bien chez ce cher Serge?" + CouleurConsole.RESET);
    }

    public static void main(String[] args) {
        new Cours25_couleur();
    }
}
