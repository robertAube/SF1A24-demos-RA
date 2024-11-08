package partie1;

/*
Opérateur d’incrément (++)
    Préfixe (++variable) : La variable est incrémentée avant d’être utilisée dans l’expression.
    Suffixe (variable++) : La variable est utilisée dans l’expression avant d’être incrémentée.
Opérateur de décrément (--)
    Préfixe (--variable) : La variable est décrémentée avant d’être utilisée dans l’expression.
    Suffixe (variable--) : La variable est utilisée dans l’expression avant d’être décrémentée.
 */
public class Cours11b_operateursDIncrement {
    public Cours11b_operateursDIncrement() {
        jouerAvecOperateurIncremental();
    }


    private void jouerAvecOperateurIncremental() {
        int i;

        i = 5;
        ++i;
        System.out.println(i); //affiche 6
        i++;
        System.out.println(i); //affiche 7

        System.out.println(++i); //affiche 8
        System.out.println(i); //affiche 8

        System.out.println(i++); //affiche 8
        System.out.println(i); //affiche 9
    }

    public static void main(String[] args) {
        new Cours11b_operateursDIncrement();

    }
}
