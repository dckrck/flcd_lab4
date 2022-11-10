
import program.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        System.out.println();
        System.out.println("P1");
        LexycalScanner p1_scanner = new LexycalScanner("src/resources/P1.txt", "src/resources/PIF1.txt", "src/resources/ST1.txt");
        p1_scanner.scan();

        System.out.println();
        System.out.println("P2");
        LexycalScanner p2_scanner = new LexycalScanner("src/resources/P2.txt", "src/resources/PIF2.txt", "src/resources/ST2.txt");
        p2_scanner.scan();


        System.out.println();
        System.out.println("P3");
        LexycalScanner p3_scanner = new LexycalScanner("src/resources/P3.txt", "src/resources/PIF3.txt", "src/resources/ST3.txt");
        p3_scanner.scan();

        System.out.println();
        System.out.println("P1ERR");
        LexycalScanner p1_scanner_err = new LexycalScanner("src/resources/P1err.txt", "src/resources/PIFerr.txt", "src/resources/STerr.txt");
        p1_scanner_err.scan();
        */

        FiniteAutomaton finiteAutomaton = new FiniteAutomaton("FA.in");

        printMenu();
        Scanner menuScanner = new Scanner(System.in);
        int option = menuScanner.nextInt();

        while(option >= 1 && option <= 5) {
            switch (option) {
                case 1:
                    System.out.println("States: ");
                    System.out.println(finiteAutomaton.buildStates());
                    break;

                case 2:
                    System.out.println("Alphabet: ");
                    System.out.println(finiteAutomaton.buildAlphabet());
                    break;
                case 3:
                    System.out.println("Final States: ");
                    System.out.println(finiteAutomaton.buildFinalStates());
                    break;
                case 4:
                    System.out.println("Transitions: ");
                    System.out.println(finiteAutomaton.buildTransitions());
                case 5:
                    continue;

            }
        }

    }

    public static void printMenu() {
        System.out.println("1) Print States");
        System.out.println("2) Print Alphabet");
        System.out.println("3) Print Final States");
        System.out.println("4) Print Transitions");
        System.out.println("5) Check DFA");
        System.out.println("6) Exit Program ");
    }

    public void scannerMenu() {

    }
}