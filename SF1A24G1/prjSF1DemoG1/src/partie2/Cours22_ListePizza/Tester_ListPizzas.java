package partie2.Cours22_ListePizza;

public class Tester_ListPizzas {
    public Tester_ListPizzas() {
        tester_creerPizza();
    }

    private void tester_creerPizza() {
        ListPizzas listPizzas = new ListPizzas(5);

        System.out.println(listPizzas);

        listPizzas.avancerPizza(1000);

        System.out.println(listPizzas);
    }

    public static void main(String[] args) {
        new Tester_ListPizzas();
    }
}
