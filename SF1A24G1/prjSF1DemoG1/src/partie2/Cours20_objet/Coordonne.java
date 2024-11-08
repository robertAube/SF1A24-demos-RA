package partie2.Cours20_objet;

public class Coordonne {
    //constante de classe (static)
    //constante : valeur qui ne peut jamais changer. norme : Toujours en majuscule
    //static : appartient à la classe. existe sans faire d'instance
    //final : la variabale ne peut pas changer après son initialisation
    public static final int MIN_XY = -100;
    public static final int MAX_XY = -MIN_XY;

    private int x;
    private int y;

    public Coordonne(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (xyEstValide(x)) {
            this.x = x;
        } else {
            throw new IllegalArgumentException("x est invalide : " + x);
        }
    }

    public static boolean xyEstValide(int xy) {
        return (MIN_XY <= xy && xy <= MAX_XY);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (xyEstValide(y)) {
            this.y = y;
        } else {
            throw new IllegalArgumentException("y est invalide : " + y);
        }
    }
}
