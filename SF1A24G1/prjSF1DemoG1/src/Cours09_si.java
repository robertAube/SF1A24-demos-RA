public class Cours09_si {
    public Cours09_si() {
        // tester_afficherNoteEstReussiteV2();

        tester_calculerRabais();

    }

    private void tester_calculerRabais() {
        System.out.println("tester_calculerRabais()");
        System.out.println(calculerRabais(20) == 0);
        System.out.println(calculerRabais(99.99) == 0);
        System.out.println(calculerRabais(100) == 0.02);
        System.out.println(calculerRabais(499.99) == 0.02);
        System.out.println(calculerRabais(500) == 0.03);
        System.out.println(calculerRabais(999.99) == 0.03);
        System.out.println(calculerRabais(1000) == 0.04);
    }

    //    o	Faire une méthode calculerRabais qui reçoit un montant (un double) et retourne le rabais (un double) :
//            	-infini, 100[ -> 0
//            	[100, 500[ -> 2%
//            	[500, 1000[ -> 3%
//            	[1000, infini -> 4%
    private double calculerRabais(double montant) {
        double rabais;

        if (montant < 100) {
            rabais = 0;
        } else if (montant < 500) {
            rabais = 0.02;
        } else if (montant < 1000) {
            rabais = 0.03;
        } else {
            rabais = 0.04;
        }
        return rabais;
    }

    private void tester_afficherNoteEstReussiteV1() {
        afficherNoteEstReussiteV1(66);
        afficherNoteEstReussiteV1(60);
        afficherNoteEstReussiteV1(59);
        afficherNoteEstReussiteV1(0);
    }

    private void tester_afficherNoteEstReussiteV2() {
        afficherNoteEstReussiteV2(66);
        afficherNoteEstReussiteV2(60);
        afficherNoteEstReussiteV2(59);
        afficherNoteEstReussiteV2(0);
    }

    private void afficherNoteEstReussiteV2(int noteSurCent) {
        boolean estUnSucces; //type boolean permet de conserver la valeur true ou false;
        String str;

        estUnSucces = noteSurCent >= 60;

        str = "La note " + noteSurCent + "/100 est ";

        str += estUnSucces ? "une réussite" : "un échec";

        System.out.println(str + '.');
    }

    private void afficherNoteEstReussiteV1(int noteSurCent) {
        boolean estUnSucces; //type boolean permet de conserver la valeur true ou false;
        String str;

        estUnSucces = noteSurCent >= 60;

        str = "La note " + noteSurCent + "/100 est ";

        if (estUnSucces) {
            str += "une réussite";
        } else {
            str += "un échec";
        }

        System.out.println(str + '.');
    }

    public static void main(String[] args) {
        new Cours09_si();
    }
}
