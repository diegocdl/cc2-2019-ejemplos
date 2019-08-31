import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.io.*;

public class Ej1 {
    public static ConcurrentLinkedQueue<Integer> cIn;

    public static Stack<Integer> s1_cuadrado;
    public static Stack<String> s2_string;
    
    public static void main(String[] args) throws Exception {
        cIn = new ConcurrentLinkedQueue<Integer>();
        s1_cuadrado = new Stack<Integer>();
        s2_string = new Stack<String>();
        int e;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while(true) {
            System.out.println("1 meter a la cola\n2 elevar al cuadrado\n3 convertir a string\n4 sacar de la ultima pila e imprimir");
            System.out.print("Elija una opcion: ");
            String op = br.readLine();

            switch(op) {
                case "1":
                    int random = (int)(Math.random()*100);
                    cIn.add(random);
                    // 1 meter a la cola
                    break;
                case "2":
                    // 2 elevar al cuadrado
                    if(!cIn.isEmpty()) {
                        e = cIn.poll();
                        e = (int)Math.pow(e, 2);
                        s1_cuadrado.push(e);
                    } else {
                        System.out.println("No hay elementos en la cola");
                    }
                    break;
                case "3":
                    // 3 convertir a string
                    if(!s1_cuadrado.empty()) {
                    e = s1_cuadrado.pop();
                    s2_string.push(Integer.toHexString(e));
                    } else {
                        System.out.println("No hay elementos en el Stack 1");
                    }
                    break;
                case "4":
                    // 4 sacar de la ultima pila e imprimir
                    if(!s2_string.empty()) {
                        System.out.println("Termina proceso: " + s2_string.pop());
                    } else {
                        System.out.println("No hay elementos en el Stack 2");
                    }
                    break;
            }

            printQueue();
            printStacks();
            System.out.println("--------------------------------------");
        }
    }


    public static void printQueue() {
        System.out.println("Cola: " + cIn);
    }

    public static void printStacks() {
        System.out.println("Stack (numeros al cuadrado): " + s1_cuadrado);
        System.out.println("Stack (numeros como string): "+ s2_string);
    }
}