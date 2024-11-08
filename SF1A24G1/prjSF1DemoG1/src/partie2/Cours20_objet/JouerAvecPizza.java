package partie2.Cours20_objet;

public class JouerAvecPizza {
    public JouerAvecPizza() {
        //creerUnePizza();
        //jouerAvecNPizza();

        //tester_getSetVitesse();
        vitesseSaisiParUsager();
    }

    private void vitesseSaisiParUsager() {
        Pizza p;
        int vitesseLu;


        do {
            vitesseLu = Util.lireInt("Donnez la vitesse : ");

        } while (!Pizza.vitesseEstValide(vitesseLu));

        p = new Pizza(1,2,"jaune", 1);
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

        for (int i = 0; i < tabPizza.length; i++) {
            System.out.println(tabPizza[i]);
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
