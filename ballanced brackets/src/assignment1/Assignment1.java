package assignment1;

public class Assignment1 {

    public static void main(String[] args) {
        String expression;
        boolean check = true;
        while (check) {
            expression = Validation.checkExpression();
            if (MatchingParentheses.isMatchingParentheses(expression)) {
                System.out.println("The expression is valid.");
            } else {
                System.out.println("The expression is not valid.");
            }
            check = Validation.checkYN();
        }
    }

}
