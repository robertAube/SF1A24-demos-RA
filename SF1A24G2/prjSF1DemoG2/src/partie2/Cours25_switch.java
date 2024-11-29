package partie2;

public class Cours25_switch {

    public Cours25_switch() {
//        tester_getStrPriorite();
//        tester_quelJour();
        tester_souhaiter();
    }

    private void tester_getStrPriorite() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("priorité " + i + " = " + getStrPriorite(i));
        }
        System.out.println();
    }

    public String getStrPriorite(int priorite) {
        String strNiveau;

        switch (priorite) {
            case 1:
                strNiveau = "Haute";
                break;
            case 2:
                strNiveau = "Moyenne";
                break;
            case 3:
                strNiveau = "Basse";
                break;
            default:
                strNiveau = "Inconnue";
                break;
        }
        return strNiveau;
    }

    private void tester_quelJour() {
        for (int noJour = 0; noJour <= 8; noJour++) {
            System.out.println("jour " + noJour + " = " + quelJour(noJour));
        }
        System.out.println();

    }

    public String quelJour(int jour) {
        String typeTravail = "";

        switch (jour) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                typeTravail = "jour de travail";
                break;
            case 6:
            case 7:
                typeTravail = "jour de congé";
                break;
            default:
                typeTravail = "Invalide";
        }
        return typeTravail;
    }
    private void tester_souhaiter() {
        String[] tabJourFerie = {"Ma fête", "Nouvel An", "Noël", "Fête du Travail"};

        for (int i = 0; i < tabJourFerie.length; i++) {
            System.out.println(tabJourFerie[i] + " : " + souhaiter(tabJourFerie[i]));
        }
    }


    public String souhaiter(String jourFerie) {
        String souhait;

        switch (jourFerie) {
            case "Nouvel An":
                souhait = "Bonne année !";
                break;
            case "Noël":
                souhait = "Joyeux Noël !";
                break;
            case "Fête du Travail":
                souhait = "Bonne fête du travail !";
                break;
            default:
                souhait = "Jour férié inconnu.";
                break;
        }
        return souhait;
    }

    public static void main(String[] args) {
        new Cours25_switch();
    }

}
