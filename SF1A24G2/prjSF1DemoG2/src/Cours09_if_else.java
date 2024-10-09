public class Cours09_if_else {
    public Cours09_if_else() {
        //   tester_afficherNoteEstReussite();
        // tester_calculerRabais();
        tester_afficherNoteEstReussiteVSiCompact();
    }

    /*
    o	Faire une méthode calculerRabais qui reçoit un montant (un double) et retourne le rabais (un double) :
        	-infini, 100[ -> 0
        	[100, 500[ -> 2%
        	[500, 1000[ -> 3%
        	[1000, infini -> 4%
     */
    public double calculerRabais(double montant) {
        double rabais;

        if (montant < 100) {
            rabais = 0;
        } else if (montant < 500)
            rabais = 0.02;
        else if (montant < 1000)
            rabais = 0.03;
        else
            rabais = 0.04;

        return rabais;
    }

    public void tester_calculerRabais() {
        boolean estUnSucces;

        estUnSucces = calculerRabais(0) == 0;
        estUnSucces &= calculerRabais(99.99) == 0;
        estUnSucces &= calculerRabais(100) == 0.02;
        estUnSucces &= calculerRabais(101) == 0.02;
        estUnSucces &= calculerRabais(499.99) == 0.02;
        estUnSucces &= calculerRabais(500) == 0.03;
        estUnSucces &= calculerRabais(999.99) == 0.03;
        estUnSucces &= calculerRabais(1000) == 0.04;

        System.out.println("calculerRabais() -> " + estUnSucces);
    }


    public void tester_afficherNoteEstReussite() {
        afficherNoteEstReussite(-10);
        afficherNoteEstReussite(0);
        afficherNoteEstReussite(59);
        afficherNoteEstReussite(60);
        afficherNoteEstReussite(100);
    }

    public void tester_afficherNoteEstReussiteVSiCompact() {
        afficherNoteEstReussiteVSiCompact(-10);
        afficherNoteEstReussiteVSiCompact(0);
        afficherNoteEstReussiteVSiCompact(59);
        afficherNoteEstReussiteVSiCompact(60);
        afficherNoteEstReussiteVSiCompact(100);
    }


    public void afficherNoteEstReussite(int noteSur100) {
        boolean estUnSucces; //type boolean permet de conserver la valeur true ou false
        String str;

        estUnSucces = noteSur100 >= 60;

        str = "La note " + noteSur100 + " est ";

        if (estUnSucces) {
            str += "une réussite";
        } else {
            str += "un échec";
        }

        System.out.println(str + '.');
    }

    public void afficherNoteEstReussiteVSiCompact(int noteSur100) {
        boolean estUnSucces; //type boolean permet de conserver la valeur true ou false
        String str;

        estUnSucces = noteSur100 >= 60;

        str = "La note " + noteSur100 + " est ";

        str += estUnSucces ? "une réussite" : "un échec";

        System.out.println(str + '.');
    }

    public static void main(String[] args) {
        new Cours09_if_else();
    }
}
