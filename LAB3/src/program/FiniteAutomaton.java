package program;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class FiniteAutomaton {
    public HashSet<String> states;
    public HashSet<String> alphabet;
    public HashSet<String> finalStates;
    public String initialState;

    //transitions todo

    public FiniteAutomaton(String file) {
        states = new HashSet<>();
        alphabet = new HashSet<>();
        finalStates = new HashSet<>();
        // transitions todo

        readFromFile(file);
    }

    public void readFromFile(String file) {
        try {
            File faFile = new File(file);
            Scanner faScanner = new Scanner(faFile);

            String statesLine = faScanner.nextLine();
            String[] stateElems = statesLine.split(" ");
            List<String> statesList = Arrays.asList(stateElems);
            states = new HashSet<>(statesList);

            String alphabetLine = faScanner.nextLine();
            String[] alphabetElems = statesLine.split(" ");
            List<String> alphabetList = Arrays.asList(alphabetElems);
            alphabet = new HashSet<>(statesList);

            initialState = faScanner.nextLine().trim();

            String finalStateLine = faScanner.nextLine();
            String[] finalStateElems = statesLine.split(" ");
            List<String> finalStateList = Arrays.asList(alphabetElems);
            finalStates = new HashSet<>(statesList);

            //transitions todo
            /*
            while(faScanner.hasNext()) {

            }*/

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String buildStates() {
        StringBuilder builder = new StringBuilder();
        for(String state : this.states)
            builder.append(state).append(", ");
        return builder.toString();
    }

    public String buildAlphabet() {
        StringBuilder builder = new StringBuilder();
        for(String symbol : this.alphabet)
            builder.append(symbol).append(", ");
        return builder.toString();
    }

    public String buildFinalStates() {
        StringBuilder builder = new StringBuilder();
        for(String finalState : this.finalStates)
            builder.append(finalState).append(", ");
        return builder.toString();
    }

    public String buildInitialState() {
        return this.initialState;
    }

    public String buildTransitions() {
        return new String("todo");
    }
}
