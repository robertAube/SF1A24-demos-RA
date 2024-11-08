package partie2.Cours19_objet;

public class Pizza {
    //Attributs ou variables d'instance
    //Pour que ces variables existent, la classe doit être instanciée avec le new
    //encapsulation des attributs: on met les attributs private pour évier leur modification à l'extérieur de la classe

    private int x; //les attributs doivent être toujours encapsulé donc private
    private int y;
    private String couleur;
    private int vitesse;

    public Pizza(int x, int y, String couleur, int vitesse) {
        this.x = x; //le mot clé this fait référence à l'instance courante.
        this.y = y; //attribut est mauve & variable locale est noir
        this.vitesse = vitesse;
        this.couleur = couleur;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        if (vitesseEstValide(vitesse)) {
            this.vitesse = vitesse;
        } else {
            throw new IllegalArgumentException("Vitesse invalide : " + vitesse);
        }
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
                ", couleur='" + couleur + '\'' +
                ", vitesse=" + vitesse +
                '}';
    }
}
