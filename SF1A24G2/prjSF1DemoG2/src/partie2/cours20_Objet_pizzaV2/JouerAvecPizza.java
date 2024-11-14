package partie2.cours20_Objet_pizzaV2;

import partie2.Cours21_tabDePizzas.Coordonnee;
import partie2.Cours21_tabDePizzas.Pizza;
import partie2.Cours21_tabDePizzas.Util;

public class JouerAvecPizza {
    public JouerAvecPizza() {
//        creerUnePizza();
        // jouerAvecNPizza(6);
        tester_mutateurAccesseur();
//        tester_getEtSetVitesse();
//        vitesseSaisieParUsager();
    }

    private void tester_mutateurAccesseur() {
        Pizza p;

        p = new Pizza(0, 0, 1, "bleu");

        System.out.println(p);

        p.setPositionV1(new Coordonnee(1,2));

        System.out.println(p);
        p.setPositionV2(new Coordonnee(2,3));

        System.out.println(p);
        p.setPositionV3(new Coordonnee(3,4));

        System.out.println(p);
    }

    private void jouerAvecNPizza(int n) {
        String[] listeCouleur = {"bleu", "rouge", "jaune", "violet"};
        Pizza[] tabPizza = new Pizza[n];

        for (int i = 0; i < n; i++) {
            tabPizza[i] = new Pizza(i * 10, i * 100, i, listeCouleur[i % (listeCouleur.length)]);
        }

        afficherPizzas(tabPizza);

        avancerPizzaA(tabPizza, 1000);

        afficherPizzas(tabPizza);
    }

    private void afficherPizzas(Pizza[] tabPizza) {
        for (int i = 0; i < tabPizza.length; i++) {
            System.out.println(tabPizza[i].toString());
        }
    }

    private void avancerPizzaA(Pizza[] tPizza, int limiteX) {
        for (int i = 0; i < tPizza.length; i++) {
            avancerPizzaA(tPizza[i], limiteX);
        }
    }

    private void avancerPizzaA(Pizza pizza, int limiteX) {
        while (pizza.getX() < limiteX) {
            pizza.avancerX();
        }
    }

    private void vitesseSaisieParUsager() {
        Pizza p = null;
        int vitesseLu;

        do {
            vitesseLu = Util.lireInt("Donnez la vitesse : ");
            if (Pizza.vitesseEstValide(vitesseLu)) {
                p = new Pizza(0, 0, vitesseLu, "bleu");
            }
        }
        while (!Pizza.vitesseEstValide(vitesseLu));
        //si vitesse est valide

        System.out.println(p);

    }

    private void tester_getEtSetVitesse() {
        Pizza p;

        p = new Pizza(0, 0, -1, "bleu");

        System.out.println(p);

        System.out.println(p.getVitesse());

        p.setVitesse(100);

        System.out.println(p.getVitesse());

        p.setVitesse(-100);

        System.out.println(p.getVitesse());
    }


    private void creerUnePizza() {
        Pizza p;

        p = new Pizza(0, 0, 1, "bleu");

//        p.couleur = "rouge"; //pas accessible parce que c'est encapsulé (private)
        System.out.println(p);
        p.avancerX();
        System.out.println(p.toString()); //par défaut on appelle la méthode toString de l'objet

    }

    public static void main(String[] args) {
        new JouerAvecPizza();
    }
}
