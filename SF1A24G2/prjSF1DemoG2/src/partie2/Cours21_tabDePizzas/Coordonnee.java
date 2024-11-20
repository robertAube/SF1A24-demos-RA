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

    public Coordonnee get() {
        Coordonnee c;

        c = new Coordonnee(x, y);

        return c;
    }

    public void set(Coordonnee c) {
//        setX(c.x); // pas nécessaire: x repecte déjà les contraintes de validation d'une Coordonnee
        x = c.x;
        y = c.y;
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


    @Override //écrase la definition de la classe Object
    public boolean equals(Object o) { //Object : toutes les instances en java sont de type Objet.
        //this c'est l'adresse de ma propre instance.
        if (this == o) {  // retourner true si l'objet reçu en argument est le même que l'objet courant (this)
            return true;
        }

        if (o == null) { // Retourner false si l'objet reçu en argument ne réfère pas à une instance. (null)
            return false;
        }

        if (getClass() != o.getClass()) { //Retourner faux si l'objet o n'est pas une coordonnée.
            return false;
        }

        Coordonnee that = (Coordonnee) o; //Caster la variable o en variable Coordonnee.

        if (x != ((Coordonnee)o).x) return false;
        return y == that.y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }
}
