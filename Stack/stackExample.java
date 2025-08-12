package Stack;

import java.util.*;

public class stackExample {

    public static void pushAtBottom (Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

    public static <Char> String reverseString (String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
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

    public static void reverseStack (Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack (Stack <Integer> s) {
        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
    }

    public static void stockSpan (int stock [], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);


        for(int i=1; i<stock.length; i++) {
            int currPrice = stock[i];
            while(!s.isEmpty() && currPrice > stock[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()) {
                span[i] = i+1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }

    public static void nextGreaterElement (int arr[] , int nextGreater[]) {
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1; i>=0; i--) {
            while(!s.isEmpty() &&  arr[s.peek()] < arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }

    public static void nextGreaterL(int arr[], int nextGreaterLeft[]) {
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            while(!s.isEmpty() &&  arr[s.peek()] < arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nextGreaterLeft[i] = -1;
            } else {
                nextGreaterLeft[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0; i<nextGreaterLeft.length; i++) {
             System.out.print(nextGreaterLeft[i] + " ");
        }
    }

    public static void nextSmallerLeft(int arr[], int nextSmallerL[]) {
        Stack<Integer> s = new Stack<> ();
        for(int i=0; i<arr.length; i++) {
            
        }
    }
    public static void nextSmallerRight() {}

    public static boolean validParentheses (String str) {
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '[' || ch == '{' || ch == '(') {
                s.push(ch);
            }else {
                if(s.isEmpty()) {
                    return false;
                }

                if( (ch == '}' && s.peek()== '{') || (ch == ']' && s.peek() == '[') || (ch == ')' && s.peek() == '(') ) {
                    s.pop();
                } else {
                    return false;
                }
            }


        }
        if(s.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean duplicateParentheses (String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ')') {
                int count = 0;
                while(s.peek() != '(') {
                    count++;
                    s.pop();
                }
                if(count < 1) {
                    return true;
                } else {
                    s.pop();
                }
            } else {
                s.push(ch);
            }
        }
            return false;
    }


    public static void main (String Args[]) {
        int arr[] = {2,1,6,5,2};
        int nextGreaterLeft [] = new int[arr.length];
        nextGreaterL(arr, nextGreaterLeft);

    }

}
