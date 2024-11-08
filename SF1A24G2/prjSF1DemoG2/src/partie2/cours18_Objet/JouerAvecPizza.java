package partie2.cours18_Objet;

public class JouerAvecPizza {
    public JouerAvecPizza() {
//        creerUnePizza();
//        jouerAvecNPizza();
//        tester_getEtSetVitesse();
        vitesseSaisiParUsager();
    }

    private void vitesseSaisiParUsager() {
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

        p = new Pizza(0,0, -1, "bleu");

        System.out.println(p);

        System.out.println(p.getVitesse());

        p.setVitesse(100);

        System.out.println(p.getVitesse());

        p.setVitesse(-100);

        System.out.println(p.getVitesse());
    }

    private void jouerAvecNPizza() {
        String[] listeCouleur = {"bleu", "rouge", "jaune", "violet"};
        Pizza[] tabPizza = new Pizza[listeCouleur.length];

        for (int i = 0; i < listeCouleur.length; i++) {
            tabPizza[i] = new Pizza(i *10, i *100, i, listeCouleur[i]);
        }
        for (int i = 0; i < listeCouleur.length; i++) {
            System.out.println(tabPizza[i].toString());
        }
    }

    private void creerUnePizza() {
        Pizza p;

        p = new Pizza(0,0, 1, "bleu");

//        p.couleur = "rouge"; //pas accessible parce que c'est encapsulé (private)
        System.out.println(p);
        p.avancerX();
        System.out.println(p.toString()); //par défaut on appelle la méthode toString de l'objet

    }

    public static void main(String[] args) {
        new JouerAvecPizza();
    }
}
