package partie2.Cours21_tabDePizzas;

public class Coordonnee {
    //Constante de classe
    //constante : valeur qui ne peut pas changer. norme : toujours en majuscule
    //static : appartient à la classe. Existe sans faire d'instance
    //final: la variable ne peut pas changer après son initialisation. On dit qu'elle est immutable.
    public static final int MIN_XY = Integer.MIN_VALUE;
    public static final int MAX_XY = Integer.MAX_VALUE;

    private int x;
    private int y;


    public Coordonnee(int x, int y) {
        setX(x);
        setY(y);
    }

    //mutateurs
    public void setX(int x) {
        if (xyEstValide(x)) {
            this.x = x;
        } else {
            throw new IllegalArgumentException("x invalide : " + x);
        }
    }

    public void setY(int y) {
        if (xyEstValide(y)) {
            this.y = y;
        } else {
            throw new IllegalArgumentException("y invalide : " + y);
        }
    }

    public static boolean xyEstValide(int valeur) {
        return MIN_XY <= valeur && valeur <= MAX_XY;
    }

    //accesseurs
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }
}
