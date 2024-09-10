/*
    Ordre des méthodes n'a pas d'importance sauf que le constructeur doit être la première méthode et le main la dernière
 */
public class Cours02_calculs {
    public Cours02_calculs() {
        afficher1plus1V1(); //ALT-Enter pour créer la méthode rapidement
        afficher1plus1V2();
        afficherDesAdditionsAvecDesReels();
        afficherDesSoustrations();
        afficherMultiplications();
        afficher1DivisePar2();
        afficherLeNombreRecuEnParametre(6);
        afficherLeNombreRecuEnParametre(3);
        afficherLeNombreRecuEnParametre(-5);
        afficherLeNombreRecuEnParametre((int)1.56);
    // System.out.println(reponse); //une variable est connu uniquement localement : donc réponse est inconnu
    }

    private void afficherLeNombreRecuEnParametre(int nbEntier) {
        System.out.println("Le nombre reçu en paramètre (ou en argument) = " + nbEntier);
    }

    private void afficher1DivisePar2() {
        int dividente = 1;
        int diviseur;
        double doubleQuotient;
        int intQuotient;

        diviseur = 2;
        doubleQuotient = (double) dividente / diviseur; //ici, on a fait un cast pour forcer java à faire le calcule en réel (double)

        System.out.println(dividente + " / " + diviseur + " = " + doubleQuotient);

        intQuotient = (int) doubleQuotient; //ici, on perd la précision du double en plaçant un réél dans un entier.

        System.out.println(dividente + " / " + diviseur + " = " + intQuotient);
    }

    private void afficherMultiplications() {
        System.out.println("2 * 3 = " + 2 * 3); //priorité des opérateurs le * et / se sont en premier
    }

    private void afficherDesSoustrations() {
        System.out.println("2 - 3 = " + (2 - 3));
    }

    private void afficherDesAdditionsAvecDesReels() {
        double reponse; //Déclaration d'une variable de type réel (double)
        reponse = 1.0; //1.0 est une constante de type réel
        System.out.println(reponse);

        reponse = reponse + 2.24 + 2;

        System.out.println(reponse);
    }

    private void afficher1plus1V2() {
        int reponse; //Déclaration d'une variable de type entier (int) - jamais d'accent dans un nom de variable

        reponse = 1 + 1; //faire l'addition de 2 entiers et l'affecter à reponse

        System.out.print("1 + 1 = "); //print tout court ne place pas de saut à la ligne après (ln)
        System.out.println(reponse);

        System.out.println("1 + 1 = " + reponse); //Ici, le + indique à java de concaténer la chaine "1 + 1 = " à la variable reponse
    }

    private void afficher1plus1V1() {
        System.out.print("1 + 1 = "); //print tout court ne place pas de saut à la ligne après (ln)
        System.out.println(1 + 1);
    }

    public static void main(String[] args) {
        new Cours02_calculs();
    }
}
