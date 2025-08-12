package Queue;
import java.util.*;
public class Question {

    public static void interLeave(Queue<Integer> q) {
        Queue<Integer> FirstHalf = new LinkedList<>();
        int size = q.size();
        for(int i=0; i<size/2; i++) {
            FirstHalf.add(q.remove());
        }

        while(!FirstHalf.isEmpty()) {
            q.add(FirstHalf.remove());
            q.add(q.remove());
        }
    }

    public static void reverseQueue (Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()) {
            s.push(q.remove());
        }
        while(!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void nonRepeatingSymbol(String str) {
        Queue<Character> q = new LinkedList<>();
        int freq [] = new int[26];
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
            q.add(ch);


            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
                q.remove();
            }

            if(q.isEmpty()){
                System.out.print(-1 + " ");
            }else {
                System.out.print(q.peek() + " ");
            }
        }
        System.out.println();
    }

    public static void main (String[] Args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverseQueue(q);
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }
}
