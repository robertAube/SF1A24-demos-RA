package partie1;

public class Cours10_Math {
    public Cours10_Math() {
        tester_fonctionsClasseMath();
        tester_pow();
    }

    private void tester_pow() {
        String str;
        double puissance;
        double valeur;

        valeur = 3;
        puissance = 2;
        str = valeur + " puissance " + puissance + " = " + Math.pow(valeur, puissance);
        System.out.println(str);

        valeur = 9;
        puissance = .5;
        str = valeur + " puissance " + puissance + " = " + Math.pow(valeur, puissance);
        System.out.println(str);


        valeur = 9;
        str = "La racine carré de " + valeur + " = " + Math.sqrt(valeur);
        System.out.println(str);
    }

    private void tester_fonctionsClasseMath() {
        int i;

        i = -16;
        System.out.println("La valeur absolue de " + i + " = " + Math.abs(i));

        i = 0;
        System.out.println("La valeur absolue de " + i + " = " + Math.abs(i));

        i = 16;
        System.out.println("La valeur absolue de " + i + " = " + Math.abs(i));

        System.out.println("PI = " + Math.PI);


    }

    public static void main(String[] args) {
        new Cours10_Math();
    }
}
