public class Cours04_parseInt {
    public Cours04_parseInt() {
        afficherNbString("24");
        afficherNbString("0");
        afficherNbString("allo");
    }

    private void afficherNbString(String strNombre) {
        int intNombre;
        System.out.println("Nombre: " + strNombre);
        System.out.println(strNombre + 6); //ici le + est une concaténation : affiche 246

        intNombre = Integer.parseInt(strNombre);

        System.out.println(intNombre + 6); //ici le + est une addition : affiche 30
    }

    public static void main(String[] args) {
        new Cours04_parseInt();
    }
}
