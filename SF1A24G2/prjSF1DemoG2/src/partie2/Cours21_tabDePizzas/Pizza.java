package partie2.Cours21_tabDePizzas;

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


    //accesseur
    public Coordonnee getPosition() {
        return position;
    }

    //mutateur
    public void setPositionV1(Coordonnee position) {
        this.position = position; //attention: c'est la position de l'appelant qui est utilisé. Risque que la position ne repecte pas les règle d'une coordonne de Pizza
    }
    //mutateur

    public void setPositionV2(Coordonnee position) { //la meilleur
        this.position.setX(position.getX());
        this.position.setY(position.getY());
    }


    public void setPositionV3(Coordonnee position) { // nécessite une nouvelle instance
        this.position = new Coordonnee(position.getX(), position.getY());
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
