package assignment1;

import java.util.Scanner;
import java.util.Stack;

public class MatchingParentheses {

    static final Scanner in = new Scanner(System.in);

    public static boolean isMatchingParentheses(String test) {
        Stack<Character> testP = new Stack<>();
        char x;
        for (int i = 0; i < test.length(); i++) {
            x = test.charAt(i);
            switch (x) {
                case '(':
                case '{':
                case '[':
                    testP.push(x); //Nếu là dấu mở ngoặc thì cho vào Stack
                    break;
                case ')':
                    if (testP.isEmpty() || testP.peek() != '(') {//Nếu Stack empty hoặc dấu lấy ra ko hợp với dấu so sánh thì trả về false
                        return false;
                    }
                    testP.pop(); //Nếu hợp thì bỏ dấu đó trong Stack ra
                    break;
                case '}':
                    if (testP.isEmpty() || testP.peek() != '{') {
                        return false;
                    }
                    testP.pop();
                    break;
                case ']':
                    if (testP.isEmpty() || testP.peek() != '[') {
                        return false;
                    }
                    testP.pop();
                    break;
            }
        }
        return testP.empty();
    }
}
