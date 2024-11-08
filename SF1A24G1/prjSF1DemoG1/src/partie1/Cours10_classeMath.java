package partie1;

public class Cours10_classeMath {
    public Cours10_classeMath() {
      //  tester_fonctionsClassMath();
     //   tester_pow();
        tester_sqrt();
    }

    private void tester_sqrt() {
        String str;
        double nombre;

        nombre = 4;

        str = "La racine de " + nombre + " est " + Math.sqrt(nombre);
        System.out.println(str);
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

    }

    private void tester_fonctionsClassMath() {
        System.out.println("PI = " + Math.PI);
        System.out.println(Math.abs(-15));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-0));
        System.out.println(Math.abs(15));
    }

    public static void main(String[] args) {
        new Cours10_classeMath();
    }
}
