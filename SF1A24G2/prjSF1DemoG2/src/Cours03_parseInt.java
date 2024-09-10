public class Cours03_parseInt {
    public Cours03_parseInt() {
        tester_parseInt();
    }

    private void tester_parseInt() {
        afficherParsInt("32");
        afficherParsInt("0");
        afficherParsInt("allo");
    }

    private void afficherParsInt(String strNombre) {
        int intNombre;

        intNombre = Integer.parseInt(strNombre);

        System.out.println(strNombre + 4);
        System.out.println(intNombre + 4);
    }

    public static void main(String[] args) {
        System.out.println("Début programme");
        new Cours03_parseInt();
    }
}
