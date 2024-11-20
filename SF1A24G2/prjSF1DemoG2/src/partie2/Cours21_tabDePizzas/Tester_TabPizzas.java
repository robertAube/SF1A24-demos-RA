package partie2.Cours21_tabDePizzas;

public class Tester_TabPizzas {
    public Tester_TabPizzas() {
        tester_creerPizza();
    }

    private void tester_creerPizza() {
        ListePizzas tabPizza = new ListePizzas();

        System.out.println(tabPizza);

        tabPizza = new ListePizzas(8);

        System.out.println(tabPizza);

        tabPizza.avancerPizza(1000);

        System.out.println(tabPizza);
    }

    public static void main(String[] args) {
        new Tester_TabPizzas();
    }
}
