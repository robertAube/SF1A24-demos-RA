package partie2.cours18_Objet;

public class Pizza {
    //Attributs ou des variables d'instance
    //Pour qu'elles existent, la classe doit être instanciée avec un new
    //encapsulation des attributs : on met les attributs private pour éviter leur modification à l'extérieur de la classe
    private int x;
    private int y;
    private int vitesse;

    private String couleur;

    public Pizza(int x, int y, int vitesse, String couleur) {
        this.x = x; // le mot clé this fait référence à l'instance courante
        this.y = y; // variable d'instance est mauve & variable local est noir
        setVitesse(vitesse);
        this.couleur = couleur;
    }

    public int getVitesse() {
        return vitesse;
    } //accesseur

    public void setVitesse(int vitesse) { //mutateur
        if (!vitesseEstValide(vitesse))
            //On lance une exception de Type IllegalArgumentException avec un message
            //throw lance l'exception
            throw new IllegalArgumentException("Vitesse invalide : " + vitesse);
        this.vitesse = vitesse;
    }

    public static boolean vitesseEstValide(int vitesse) {
        return vitesse >= 0;
    }

    public void avancerX() {
        x += vitesse;
    }



    @Override
    public String toString() {
        return "Pizza{" +
                "x=" + x +
                ", y=" + y +
                ", vitesse=" + vitesse +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
