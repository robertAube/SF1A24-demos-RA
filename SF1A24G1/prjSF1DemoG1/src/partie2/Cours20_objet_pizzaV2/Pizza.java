package partie2.Cours20_objet_pizzaV2;

public class Pizza {
    //Attributs ou variables d'instance
    //Pour que ces variables existent, la classe doit être instanciée avec le new
    //encapsulation des attributs : on met les attributs private pour évier leur modification à l'extérieur de la classe

    private Coordonnee position; //les attributs doivent être toujours encapsulé donc private
    private String couleur;
    private int vitesse;

    public Pizza(int x, int y, String couleur, int vitesse) {
        this.position = new Coordonnee(x, y); //le mot clé this fait référence à l'instance courante.
        this.vitesse = vitesse;
        this.couleur = couleur;
    }

    public int getX() {
        return position.getX();
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
        position.setX(position.getX() + vitesse);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                position +
                ", couleur='" + couleur + '\'' +
                ", vitesse=" + vitesse +
                '}';
    }
}
