import java.util.regex.*;
import java.util.*;
import java.io.*;

public class EjemploArrayList {
    public static void main(String[] args) throws Exception {
        Random r = new Random();

        int size = 1000; // default size 1000
        if(args.length > 0 && Pattern.matches("[\\d]+", args[0])) {
            // change the default size at run
            // e.g java EjemploArrayList N
            size = Integer.parseInt(args[0]); 
        }
        ArrayList<Integer> data = new ArrayList<Integer>(size);
        for(int i = 0; i < size; i++) {
            data.add(r.nextInt(size));
        }
        System.out.println(data);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        do {
            System.out.print("Ingrese un numero: ");
            n = Integer.parseInt(br.readLine());
            if(data.contains(n)) {
                System.out.println("El numero si existe.");
            } else {
                System.out.println("El numero NO existe.");
            }
        } while( n != -1); // stop when user input -1 
    }
}