import java.util.concurrent.*;
import java.io.BufferedReader;
import java.util.*;
import java.io.*;

public class QueueTest {
    public static void main(String[] args) throws Exception {
        Random r = new Random();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        ConcurrentLinkedQueue<Integer> c1 = new ConcurrentLinkedQueue<Integer>();
        ConcurrentLinkedQueue<Integer> c2 = new ConcurrentLinkedQueue<Integer>();

        for(int i = 0; i < 10; i++) {
            c1.add(r.nextInt(100));
            c2.add(r.nextInt(100));
        }

        System.out.println("Cola 1: " + c1);
        System.out.println("Cola 2: " + c2);

        while(!c1.isEmpty() || !c2.isEmpty()) {
            Integer x = c1.peek();
            Integer y = c2.peek();
            System.out.println("-----------------------------------");
            if(x == null && y != null) {
                System.out.println("Removido de c2: " + c2.poll());
            } else if (y == null) {
                System.out.println("Removido de c1: " + c1.poll());
            } else if(x > y) {
                System.out.println("Removido de c1: " + c1.poll());
            } else {
                System.out.println("Removido de c2: " + c2.poll());
            }
            System.out.println("Cola 1: " + c1);
            System.out.println("Cola 2: " + c2);

            br.readLine(); // esperar un enter
        }
    }

}