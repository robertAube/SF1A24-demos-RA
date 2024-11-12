package partie2.cours20_Objet_pizzaV2;

public class Pizza {
    //Attributs ou des variables d'instance
    //Pour qu'elles existent, la classe doit être instanciée avec un new
    //encapsulation des attributs : on met les attributs private pour éviter leur modification à l'extérieur de la classe
    private Coordonnee position;
    private int vitesse;

    private String couleur;

    public Pizza(int x, int y, int vitesse, String couleur) {
        position = new Coordonnee(x, y);
        setVitesse(vitesse);
        this.couleur = couleur;
    }

    public int getX() {
        return position.getX();
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
        position.setX(position.getX() + vitesse);
    }

    @Override
    public String toString() {
        return "Pizza{" + position.toString() +
                ", vitesse=" + vitesse +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
