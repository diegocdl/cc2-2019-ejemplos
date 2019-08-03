import java.util.*;

public class Arreglos {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Arreglo Antes de llamar fill: " + Arrays.toString(array));
        fill(array, 4);
        System.out.println("Arreglo Despues de llamar fill: " + Arrays.toString(array));
        
        System.out.println("-----------------");
        System.out.println("Arreglo Antes de llamar fill2: " + Arrays.toString(array));
        fill2(array, 6);
        System.out.println("Arreglo Despues de llamar fill2: " + Arrays.toString(array));
        
        System.out.println("-----------------");
        int variable = 1;
        System.out.println("Variable antes de llamar a changeVar: " + variable);
        changeVar(variable, 10);
        System.out.println("Variable despues de llamar a changeVar: " + variable);
    }

    public static void fill(int[] A, int v) {
        for(int i = 0; i <= A.length - 1; i++) {
            A[i] = v;
        }
        System.out.println("Arreglo Dentro de fill: " + Arrays.toString(A));
    }

    public static void changeVar(int X, int v) {
        X = v;
        System.out.println("Variable dentro de changeVar: " + X);
    }

    public static void fill2(int[] A, int v) {
        int[] aux = new int[A.length];
        for(int i = 0; i <= A.length - 1; i++) {
            aux[i] = v;
        }
        A = aux;
        System.out.println("Arreglo Dentro de fill2: " + Arrays.toString(A));
    }

}