package partie1;

public class Cours02_calculs {
    public Cours02_calculs() {
        afficher1plus1V1();
        afficher1plus1V2(); //ALT-Entrée permet de créer ma méthode rapidement

        afficherDesAdditionsAvecDesReels();

        afficherDesSoustractions();

        afficherDesMultplications();

        afficherDesDivisions();
    }

    private void afficherDesDivisions() {
        int intDividente = 1;
        int intDiviseur = 2;

        double doubleQuotient;

        intDiviseur = 2;
        intDividente = 1;

        System.out.println( "Division sans le cast : ");
        doubleQuotient = intDividente / intDiviseur;
        System.out.println(intDividente + " / " + intDiviseur + " = " + doubleQuotient);

        System.out.println( "Division avec le cast : ");
        doubleQuotient = (double) intDividente / intDiviseur;
        System.out.println(intDividente + " / " + intDiviseur + " = " + doubleQuotient);
    }

    private void afficherDesMultplications() {
        System.out.println("2 * 3 = " + 2 * 3); //priorité des opéréteurs le * et le / se font avant + et le -
    }

    private void afficherDesSoustractions() {
        System.out.println("2 - 3 = " + 2);
        System.out.println("2 - 3 = " + (2 - 3));
    }

    private void afficherDesAdditionsAvecDesReels() {
        double reponse; //Déclaration d'une varaible local de type réel (double)

        reponse = 1;
        System.out.println(reponse);

        reponse = 1 + 2;
        System.out.println("1 + 2 = " + reponse);

        reponse = reponse + 2;
        System.out.println("reponse + 2 = " + reponse);

        reponse = reponse + 2.5; //2.5 est une constante avec décimal
        System.out.println("reponse + 2.5 = " + reponse);
    }

    private void afficher1plus1V2() {
        int reponse; //Déclaration d'une variable locale à la méthode de type entrier (int) - jamais d'Accent dans un nom de variable

        reponse = 1; //affectation de la valeur 1 à la variable reponse

        System.out.println(reponse);


        reponse = 1 + 1; //affectation de la valeur 1 à la variable reponse

        System.out.println("1+1 = " + reponse);
    }

    private void afficher1plus1V1() {
        System.out.print("1 + 1 = ");
        System.out.println(1 + 1);
    }

    public static void main(String[] args) {
        new Cours02_calculs();
    }
}
