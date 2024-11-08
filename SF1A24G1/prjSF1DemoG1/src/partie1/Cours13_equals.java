package partie1;

public class Cours13_equals {
    public Cours13_equals() {
        jouerAvecEgaliteDe2String();
    }

    private void jouerAvecEgaliteDe2String() {
        String str1 = "chat";
        String str2 = "chat";
        String str3 = "chaton";

        str3 = str3.substring(0, 4); //retourner la sous-chaîne composée des caractères 0 à 3 inclusivement

        System.out.println("str1:\t" + str1); //affiche chat
        System.out.println("str2:\t" + str2); //affiche chat
        System.out.println("str3:\t" + str3); //affiche chat

        //Ici, remplacez true par le contrôle de l'égalité entre str1 et str2
        System.out.println("Vérifier si str1 égale str2 : " + (str1.equals(str2)));

        //Ici, remplacez true par le contrôle de l'égalité entre str1 et str3
        System.out.println("Vérifier si str1 égale str3 : " + (str1.equals(str3)));
    }

    public static void main(String[] args) {
        new Cours13_equals();
    }
}
