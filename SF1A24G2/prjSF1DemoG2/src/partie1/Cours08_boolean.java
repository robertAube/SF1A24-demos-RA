package partie1;

public class Cours08_boolean {

    public Cours08_boolean() {
        jouerAvec_boolean();
    }

    private void jouerAvec_boolean() {
        int i;

        System.out.println("true -> " + true); //C'est la constante qui faut vrai
        System.out.println("false -> " + false); //C'est la constante qui faut faux

        System.out.println("2 < 3 -> " + (2 < 3)); // 2 < 3 -> true
        System.out.println("2 > 3 -> " + (2 > 3)); // 2 > 3 -> false

        System.out.println("2 == 3 -> " + (2 == 3)); // 2 == 3 -> false
        System.out.println("3 == 3 -> " + (3 == 3)); // 3 == 3 -> true

        System.out.println("2 != 3 -> " + (2 != 3)); // 2 != 3 -> true (not equal)
        System.out.println("3 != 3 -> " + (3 != 3)); // 3 != 3 -> false

        System.out.println("2 <= 3 -> " + (2 <= 3)); // 2 <= 3 -> true
        System.out.println("3 <= 3 -> " + (3 <= 3)); // 3 <= 3 -> true
        System.out.println("4 <= 3 -> " + (4 <= 3)); // 4 <= 3 -> false

        System.out.println("2 >= 3 -> " + (2 >= 3)); // 2 >= 3 -> false
        System.out.println("3 >= 3 -> " + (3 >= 3)); // 3 >= 3 -> true
        System.out.println("4 >= 3 -> " + (4 >= 3)); // 4 >= 3 -> true

        System.out.println(true && true);

        System.out.println("2 <= 3 && 3 < 4 -> " + (2 <= 3 && 3 < 4)); //2 <= 3 && 3 < 4 -> true
        System.out.println("2 < 3 && 5 < 4 -> " + (2 < 3 && 5 < 4)); //2 < 3 && 5 < 4 -> false
        System.out.println("2 > 3 && 3 < 4 -> " + (2 > 3 && 3 < 4)); //2 > 3 && 3 < 4 -> false

        System.out.println("2 <= 3 || 3 < 4 -> " + (2 <= 3 || 3 < 4)); //2 <= 3 || 3 < 4 -> true
        System.out.println("2 < 3 || 5 < 4 -> " + (2 < 3 || 5 < 4)); //2 < 3 || 5 < 4 -> true
        System.out.println("2 > 3 || 3 < 4 -> " + (2 > 3 || 3 < 4)); //2 > 3 || 3 < 4 -> true

        System.out.println("!true -> " + !true); //!true -> false
        System.out.println("!false -> " + !false); //!false -> true



        i = 0;
        System.out.print("!(i < -1) && 3 <= 1 + i || 4 * 3 - 5 < 2 -> " + (!(i < -1) && 3 <= 1 + i || 4 * 3 - 5 < 2));
        //!(i < -1) && 3 <= 1 + i || 4 * 3 - 5 < 2 -> faux
    }

    public static void main(String[] args) {
        new Cours08_boolean();
    }
}
