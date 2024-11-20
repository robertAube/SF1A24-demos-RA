package partie2.Cours22_ListePizza;

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

    public Coordonnee get() {
        Coordonnee c;
        c = new Coordonnee(this.x, y);
        return c;
    }

    public void set(Coordonnee coordonnee) {
        // setX(coordonnee.x); //pas nécessaire x respecte déjà les contraintes de validation d'une Coordonnee
        x = coordonnee.x;
        y = coordonnee.y;
    }

    public static boolean xyEstValide(int xy) {
        return (MIN_XY <= xy && xy <= MAX_XY);
    }

    @Override
    public boolean equals(Object o) {
        //this c'est l'adresse de ma propre instance
        if (this == o) return true; // retourner true si l'objet reçu en argument est moi-même.
        if (o == null)  { //si l'objet reçu en argument est null
            return false;
        }
        if (getClass() != o.getClass()) { //Retourne faux si l'objet o n'est pas une coordonnée
            return false;
        }

        Coordonnee that = (Coordonnee) o; //Caster la variable o en variable coordonnée

        if (x != that.x) return false;
        return y == that.y;
    }

    public String toString() {
        return "(" + x + ", " + y + ')';
    }
}
