package assignment1;

import static assignment1.MatchingParentheses.in;

public class Validation {

    public static String checkString() {
        String check;
        while (true) {
            check = in.nextLine();
            if (check.isEmpty()) {
                System.err.println("String's not empty");
                System.out.print("Enter string: ");
            } else {
                break;
            }
        }
        return check;
    }

    public static boolean isValidCharacter(char x) {
        char[] arrCheck = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '-', '*', '/', '(', ')', '[', ']', '{', '}', '.'};
        for (int i = 0; i < arrCheck.length; i++) {
            if (x == arrCheck[i]) {
                return true;
            }
        }
        return false;
    }

    public static String checkExpression() {
        System.out.print("Enter string: ");
        String check = checkString();
        char x;
        for (int i = 0; i < check.length(); i++) {
            x = check.charAt(i);
            if (!isValidCharacter(x)) {
                System.err.println("Invalid expression!!!");
                return checkExpression();
            }
        }
        return check;
    }

    public static boolean checkYN() {
        System.out.print("Do you want to continue?(Y/N): ");
        String check;
        while (true) {
            check = in.nextLine();
            if (check.equalsIgnoreCase("Y")) {
                System.out.println();
                return true;
            } else if (check.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.err.println("You have to input \"Y\" or \"N\"");
                System.out.print("Enter again: ");
            }
        }
    }

}
