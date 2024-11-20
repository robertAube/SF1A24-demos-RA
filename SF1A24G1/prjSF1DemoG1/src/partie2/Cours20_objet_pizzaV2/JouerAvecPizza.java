package partie2.Cours20_objet_pizzaV2;

public class JouerAvecPizza {
    public JouerAvecPizza() {
        //creerUnePizza();
        //jouerAvecNPizza();

        //tester_getSetVitesse();
        //vitesseSaisieParUsager();
        // avancerDesPizzas();

        tester_mutateurAccesseur();
    }

    private void tester_mutateurAccesseur() {
        Pizza p;
        Coordonnee c = new Coordonnee(4,8);

        p = new Pizza(2, 3, "bleu", 1);

        System.out.println(p);

        p.setPositionV3(c);
        System.out.println(p);
        c.setX(100);
        System.out.println(p);
    }

    private void avancerDesPizzas() {
        Pizza[] tabPizza;

        tabPizza = creerDesPizzas(6); //ma méthode crée un tableau

        afficherPizzas(tabPizza); //consulte le tableau déjà créé

        avancerPizza(tabPizza, 1000); //Ici les pizzas seront modifié.

        afficherPizzas(tabPizza);
    }

    private Pizza[] creerDesPizzas(int nombreACreer) {
        Pizza[] tPizza;
        String[] listeCouleur = {"bleu", "rouge", "jaune", "violet"};

        tPizza = new Pizza[nombreACreer];
        for (int i = 0; i < tPizza.length; i++) {
            tPizza[i] = new Pizza(10, i * 100, listeCouleur[i % listeCouleur.length], 1);
        }
        return tPizza;
    }

    public void avancerPizza(Pizza[] tabPizza, int limiteX) { //surcharge
        for (int i = 0; i < tabPizza.length; i++) {
            avancerPizza(tabPizza[i], limiteX);
        }
    }

    public void avancerPizza(Pizza pizza, int limiteX) {
        while (pizza.getX() < limiteX) {
            pizza.avancerX();
        }
    }

    private void vitesseSaisieParUsager() {
        Pizza p;
        int vitesseLu;

        do {
            vitesseLu = Util.lireInt("Donnez la vitesse : ");
        } while (!Pizza.vitesseEstValide(vitesseLu));

        p = new Pizza(1, 2, "jaune", 1);
        p.setVitesse(vitesseLu);

        System.out.println("La vitesse est de " + p.getVitesse());
    }

    private void tester_getSetVitesse() {
        Pizza p;

        p = new Pizza(2, 3, "bleu", 1);

        System.out.println("La vitesse est de " + p.getVitesse());

        p.setVitesse(10);

        System.out.println("La vitesse est de " + p.getVitesse());

        p.setVitesse(-1);

        System.out.println("La vitesse est de " + p.getVitesse());
    }

    private void jouerAvecNPizza() {
        String[] listeCouleur = {"bleu", "rouge", "jaune", "violet"};
        Pizza[] tabPizza = new Pizza[listeCouleur.length];

        for (int i = 0; i < tabPizza.length; i++) {
            tabPizza[i] = new Pizza(i * 10, i * 100, listeCouleur[i], i);
        }

        afficherPizzas(tabPizza);
    }

    private void afficherPizzas(Pizza[] tabPizzas) {
        for (int i = 0; i < tabPizzas.length; i++) {
            System.out.println(tabPizzas[i]);
        }
    }

    private void creerUnePizza() {
        Pizza p;

        p = new Pizza(2, 3, "bleu", 1);

        System.out.println("Pizza = " + p.toString());

        p.avancerX();

        System.out.println("Pizza = " + p);

        System.out.println("LA vitesse est de " + p.getVitesse());
    }


    public static void main(String[] args) {
        new JouerAvecPizza();
    }
}
