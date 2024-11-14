package partie2.Cours21_tabDePizzas;

public class TabPizzas {
    public static final int NB_PIZZA_PAR_DEFAUT = 0;
    private Pizza[] tabPizza;

    public TabPizzas() {
//        int a; //l'appel à un autre constructeur doit être la première ligne de code du constructeur
        this(NB_PIZZA_PAR_DEFAUT); //appelle le constructeur avec un argument
    }

    public TabPizzas(int nbPizza) {
        creerTabPizza(nbPizza);
    }

    private void creerTabPizza(int nbPizza) {
        String[] listeCouleur = {"bleu", "rouge", "jaune", "violet"};
        tabPizza = new Pizza[nbPizza];

        for (int i = 0; i < nbPizza; i++) {
            tabPizza[i] = new Pizza(i * 10, i * 100, i + 1, listeCouleur[i % (listeCouleur.length)]);
        }
    }

    public void avancerPizza(int limiteX) {
        for (int i = 0; i < tabPizza.length; i++) {
            avancerPizzaA(tabPizza[i], limiteX);
        }
    }

    private void avancerPizzaA(Pizza pizza, int limiteX) {
        while (pizza.getX() < limiteX) {
            pizza.avancerX();
        }
    }

    public String toString() {
        String s;
        s = "";
        for (int i = 0; i < tabPizza.length; i++) {
            s += (i + 1) + " - " + tabPizza[i].toString() + "\n";
        }
        return s;
    }
}
