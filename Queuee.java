import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

class Queuee {

    public static void main() {
        Queue<Integer> q = new ArrayDeque<>();
        System.out.println("Is the queue empty? " + q.isEmpty());
        System.out.println("Size of the queue: " + q.size());

        q.offer(1);
        q.peek();
        q.offer(2);
        System.out.println("Element at the front of the queue: " + q.poll());

        //important distinction is that offer() is 
        // designed for queue insertion and can indicate 
        // failure with false, whereas add() can throw an exception
        //  if insertion isn't possible.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //min heap by default
        //has exactly same methods

        //max heaap
        PriorityQueue<Integer> pqq = new PriorityQueue<>(Collections.reverseOrder());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(10);
        deque.addLast(20);

        deque.removeFirst();
        deque.removeLast();

        deque.peekFirst();
        deque.peekLast();


        //array dequeue as a stack  
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.peek(); // 30
        System.out.println(stack.pop()); // 30
        

    }
}
