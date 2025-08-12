package Stack;

import java.util.*;


public class practice {

    public static void print(Stack<Integer> s) {
        while(!s.isEmpty()) {
            System.out.print(s.pop());
        }
    }

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder();
        while(!s.isEmpty()) {
            char top = s.pop();
            result.append(top);
        }

        return result.toString();
    }

    public static void reverseStack(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void stockSpan() {}

    public static void nextGreaterElement() {}

    public static boolean validParenthesis(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx<str.length()) {
            char ch = str.charAt(idx);
            if(ch =='{' || ch == '[' || ch == '(') {
                s.push(ch);
            }

            if((ch== '}' && s.peek() == '{') || (ch== ']' && s.peek() == '[') || (ch== ')' && s.peek() == '(')) {
                s.pop();
            }

            idx++;
        }

        if(s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void duplicateParenthesis() {}

    public static void main (String Args[]) {
//        Stack<Integer> s = new Stack<>();
        String str = "[{}()";
    System.out.print(validParenthesis(str));
    }
}
