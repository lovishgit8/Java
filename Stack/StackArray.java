package Stack;

import java.util.ArrayList;
public class StackArray {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push (int data) {
            list.add(data);
        }

        public static int pop () {
            int val = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return val;
        }

        public static int peek () {
            return list.get(list.size() - 1);
        }
    }

    public static void main (String Args[]){
       Stack s = new Stack();
       s.push(1);
       s.push(2);
       s.push(3);
       System.out.println(s.isEmpty());
       s.pop();
       System.out.print(s.peek());
    }
}