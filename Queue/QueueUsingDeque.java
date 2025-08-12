package Queue;


import java.util.*;

public class QueueUsingDeque {
    static class Queue {
        static Deque<Integer> dq = new LinkedList<> ();
        public static boolean isEmpty() {
            return dq.isEmpty();
        }

        public static void add(int data) {
            dq.addLast(data);
        }
        public static int remove() {
            return dq.removeFirst();
        }

        public static int peek() {
            return dq.getFirst();
        }
    }
    public static void main(String Args[]) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
