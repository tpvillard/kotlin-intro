package hack;

/*
 Are parenthesis balanced ?
 */
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedParAnalyzer {

    private final List<Character> openPar = Arrays.asList('{', '[', '(');
    private final Stack<Character> store = new Stack<>();
    private final String input;

    private BalancedParAnalyzer(String input) {
        this.input = input;
    }

    /**
     * Check whether the input string only contains balanced parenthesis.
     * @return true when it is the case. False otherwise.
     */
    private boolean isBalanced() {

        char[] arr = input.toCharArray();
        if (arr.length <= 1) {
            return false;
        }
        for (char item : arr) {

            if (isAnOpenParenthese(item)) {
                store(item);
            } else {
                if (store.empty()) {
                    return false;
                } else {
                    Validator validator = createValidator(item);
                    if (!validator.isValid()) {
                        return false;
                    }
                }
            }
        }

        return store.empty();
    }

    private void store(char item) {
        store.push(item);
    }

    private boolean isAnOpenParenthese(char item) {
        return openPar.contains(item);
    }

    private Validator createValidator(char item) {
        Validator validator;
        switch(item) {
            case ']':
                validator = new CloseArrayValidator();
                break;
            case '}':
                validator = new CloseCodeValidator();
                break;
            case ')':
                validator = new CloseFuncValidator();
                break;
            default:
                throw new RuntimeException("Invalid character in the input: " + item);
        }
        return validator;
    }

    private interface Validator {

        boolean isValid();
    }

    public static boolean isBalanced(String input) {
        BalancedParAnalyzer analyzer = new BalancedParAnalyzer(input);
        return analyzer.isBalanced();
    }

    private class CloseArrayValidator implements Validator {
        @Override
        public boolean isValid() {
            return store.pop() == '[';
        }
    }

    private class CloseFuncValidator implements Validator {
        @Override
        public boolean isValid() {
            return store.pop() == '(';
        }
    }

    private class CloseCodeValidator implements Validator {
        @Override
        public boolean isValid() {
            return store.pop() == '{';
        }
    }
}
