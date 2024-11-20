package partie2.Cours22_ListePizza;

public class ListPizzas {
    private Pizza[] tabPizza;

    public ListPizzas(int nbPizzas) {
        tabPizza = new Pizza[nbPizzas];
        creerPizzas();
    }

    private void creerPizzas() {
        String[] listeCouleur = {"bleu", "rouge", "jaune", "violet"};
        for (int i = 0; i < tabPizza.length; i++) {
            tabPizza[i] = new Pizza(0, 0, listeCouleur[i % listeCouleur.length], 1);
        }
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < tabPizza.length; i++) {
            str += (i + 1) + " - " + tabPizza[i] + "\n";
        }
        return str;
    }

    public void avancerPizza(int limiteX) {
        for (int i = 0; i < tabPizza.length; i++) {
            avancerPizza(tabPizza[i], limiteX);
        }
    }

    private void avancerPizza(Pizza pizza, int limiteX) {
        while (pizza.getX() < limiteX) {
            pizza.avancerX();
        }
    }
}
