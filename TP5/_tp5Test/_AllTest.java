package tp5Enseignant.paquet._tp5Test;

import tp5Enseignant.paquet._tp5Test.utilTest.ITest;

/**
 * @author Robert Aubé
 * @version 1.0
 */
public class _AllTest {
    private ITest[] tabTest = {
            new CarteTest(),
            new PaquetTest(),
    };

    public _AllTest() {
        int iTest;
        for (iTest = 0; iTest < tabTest.length; iTest++) {
            tester(iTest);
        }
        System.out.println("############### Terminé!!! " + iTest + "/" + tabTest.length);
    }

    private void tester(int iTest) {
        StringBuilder str = new StringBuilder();

        str.append(iTest != 0 ? "\n" : "");
        str.append("#######  " + (iTest + 1) + " - " + (tabTest[iTest].getClass().getName()) + "()"); //cette ligne affiche le nom de la classe
        System.out.println(str);
        tabTest[iTest].tester();
    }

    public static void main(String[] args) {
        new _AllTest();
    }
}
