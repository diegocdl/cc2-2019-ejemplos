import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Stack;

public class ReverseQueue {
    public static void reverseQueue(ConcurrentLinkedQueue<Integer> queue) {
        Stack<Integer> aux = new Stack<Integer>();
        while(!queue.isEmpty())
            aux.push(queue.poll());

        while(!aux.empty())
            queue.add(aux.pop());
    }

    public static void m2(ConcurrentLinkedQueue<Integer> queue) {
        Stack<Integer> auxS = new Stack<Integer>();
        ConcurrentLinkedQueue<Integer> auxQ = new ConcurrentLinkedQueue<Integer>();
        while(!queue.isEmpty()) {
            int v = queue.poll();
            auxS.push(v);
            auxQ.add(v);
        }

        while(!auxQ.isEmpty())
            queue.add(auxQ.poll());

        while(!auxS.empty())
            queue.add(auxS.pop());
    }

    public static void main(String[] args) {
        System.out.println("Test reverseQueue");
        ConcurrentLinkedQueue<Integer> c1 = new ConcurrentLinkedQueue<Integer>();
        c1.add(1);
        c1.add(8);
        c1.add(3);
        c1.add(10);
        System.out.println("Cola Original: " + c1);
        reverseQueue(c1);
        System.out.println("Reverse de la cola: " + c1);
        System.out.println("-----------------------------------------");
        
        ConcurrentLinkedQueue<Integer> c2 = new ConcurrentLinkedQueue<Integer>();
        c2.add(-5);
        c2.add(10);
        c2.add(12);
        c2.add(1);
        c2.add(25);
        System.out.println("Cola Original: " + c2);
        reverseQueue(c2);
        System.out.println("Reverse de la cola: " + c2);
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");

        System.out.println("Test m2");
        c1 = new ConcurrentLinkedQueue<Integer>();
        c1.add(1);
        c1.add(8);
        c1.add(3);
        c1.add(10);
        System.out.println("Cola Original: " + c1);
        m2(c1);
        System.out.println("Reverse de la cola: " + c1);
        System.out.println("-----------------------------------------");

        c2 = new ConcurrentLinkedQueue<Integer>();
        c2.add(-5);
        c2.add(10);
        c2.add(12);
        c2.add(1);
        c2.add(25);
        System.out.println("Cola Original: " + c2);
        m2(c2);
        System.out.println("Reverse de la cola: " + c2);

    }
}