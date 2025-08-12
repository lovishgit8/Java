package Queue;

public class QueueLL {

    static class Node  {
        int data;
        Node next;

        Node() {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head;
        static Node tail;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void add(int data){
            Node newNode = new Node();
            if(isEmpty()) {
                head = tail = newNode;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.print("Queue is Empty");
                return -1;
            }
            int result = head.data;
            if(head == tail){
                head = tail = null;
            }else {
                head = head.next;
            }
            return result;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.print("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String Args[] ) {
        QueueCircular.Queue q = new QueueCircular.Queue(5);
        q.add(4);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
