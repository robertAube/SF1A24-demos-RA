package partie2.Cours20_objet_pizzaV2;

public class Coordonnee {
    //Constantes de classe (static final)
    //constante : valeur qui ne peut jamais changer. norme : Nom toujours en majuscule
    //static : appartient à la classe. Existe sans faire d'instance
    //final : la variable ne peut pas changer après son initialisation
    public static final int MAX_XY = 5500;
    public static final int MIN_XY = -MAX_XY;

    private int x;
    private int y;

    public Coordonnee(int x, int y) {
        setX(x);
        setY(y);
    }

    //accesseur de l'attribut x
    public int getX() {
        return x;
    }

    //mutateur de l'attribut x
    public void setX(int x) {
        if (xyEstValide(x)) {
            this.x = x;
        } else {
            throw new IllegalArgumentException("x est invalide : " + x);
        }
    }

    //accesseur de l'attribut y
    public int getY() {
        return y;
    }

    //mutateur de l'attribut y
    public void setY(int y) {
        if (xyEstValide(y)) {
            this.y = y;
        } else {
            throw new IllegalArgumentException("y est invalide : " + y);
        }
    }

    public static boolean xyEstValide(int xy) {
        return (MIN_XY <= xy && xy <= MAX_XY);
    }

    public String toString() {
        return "(" + x + ", " + y + ')';
    }
}
