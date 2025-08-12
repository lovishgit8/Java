package Queue;

import java.util.*;

public class QueueUsing2Stack {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void add(int data) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public static int remove() {
            int res = s1.pop();
            return res;
        }

        public static int peek() {
            return s1.peek();
        }
    }
    public static void main (String Args[]) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(1);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

}
