package partie1;

/*
Calcul du modulo : Calculer le reste de la division
 */
public class Cours11a_modulo {
    public Cours11a_modulo() {
        jouerAvecModulo();
    }


    private void jouerAvecModulo() {
        int restant;

        restant = 5 % 2;
        System.out.println("5 modulo 2 est " + restant);

        restant = 5 % 3;
        System.out.println("5 modulo 3 est " + restant);
    }

    public static void main(String[] args) {
        new Cours11a_modulo();

    }
}
