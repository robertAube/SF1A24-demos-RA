public class Cours08_boolean {
    public Cours08_boolean() {
        jouerAvec_boolean();
    }

    private void jouerAvec_boolean() {
        int i = 0;

        System.out.println("true -> " + true); // true c'est la constante qui vaut vrai
        System.out.println("false -> " + false); // false c'est la constante qui vaut faux

        System.out.println("2 < 3 -> " + (2 < 3)); //2 < 3 -> true
        System.out.println("2 > 3 -> " + (2 > 3)); //2 < 3 -> false

        System.out.println("2 == 3 -> " + (2 == 3)); //2 == 3 -> false
        System.out.println("3 == 3 -> " + (3 == 3)); //3 == 3 -> true
        System.out.println("2 != 3 -> " + (2 != 3)); //2 != 3 -> true
        System.out.println("3 != 3 -> " + (3 != 3)); //3 != 3 -> false

        System.out.println("3 <= 3 -> " + (3 <= 3)); //3 <= 3 -> true
        System.out.println("-3 <= 3 -> " + (-3 <= 3)); //-3 <= 3 -> true
        System.out.println("4 <= 3 -> " + (4 <= 3)); //4 <= 3 -> false

        System.out.println("3 >= 3 -> " + (3 >= 3)); //3 >= 3 -> true
        System.out.println("-3 >= 3 -> " + (-3 >= 3)); //-3 >= 3 -> faux
        System.out.println("4 >= 3 -> " + (4 >= 3)); //4 >= 3 -> true

        System.out.println("2 <= 3 && 3 < 4 -> " + (2 <= 3 && 3 < 4)); // 2 <= 3 && 3 < 4 -> true
        System.out.println("2 <= 3 && 5 < 4 -> " + (2 <= 3 && 5 < 4)); // 2 <= 3 && 5 < 4 -> false


        System.out.println("2 <= 3 || 3 < 4 -> " + (2 <= 3 || 3 < 4)); // 2 <= 3 || 3 < 4 -> true
        System.out.println("2 <= 3 || 5 < 4 -> " + (2 <= 3 || 5 < 4)); // 2 <= 3 || 5 < 4 -> true
        System.out.println("2 >= 3 || 5 < 4 -> " + (2 >= 3 || 5 < 4)); // 2 >= 3 || 5 < 4 -> false

        System.out.println("!true -> " + !true); //!true -> false
        System.out.println("!false -> " + !false); //!false -> true

        i = 0;
        System.out.println(!(i < -1) && 3 <= 1 + i || 4 * 3 - 5 < 2);

    }

    public static void main(String[] args) {
        new Cours08_boolean();
    }
}
