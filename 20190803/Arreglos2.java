import java.util.*;
public class Arreglos2 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {5, 3, 2, 1};
        int[] a3 = {1};
        int[] a4 = {1, 2, 2, 4, 5, 2};
        System.out.println(Arrays.toString(a1) + " isSortedAsc: " + isSortedAsc(a1));
        System.out.println(Arrays.toString(a2) + " isSortedAsc: " + isSortedAsc(a2));
        System.out.println(Arrays.toString(a3) + " isSortedAsc: " + isSortedAsc(a3));

        System.out.println(Arrays.toString(a1) + " cantidad de 1: " + countInArray(a1, 1));
        System.out.println(Arrays.toString(a4) + " cantidad de 2: " + countInArray(a4, 2));
    }

    public static boolean isSortedAsc(int[] A) {
        for(int i = 0; i < A.length - 1; i++) {
            if(A[i + 1] < A[i]) {
                return false;
            }
        }
        return true;
    }

    public static int countInArray(int[] A, int v) {
        int cont = 0;
        for(int e : A) {
            if(e == v) {
                cont++;
            }
        }
        return cont;
    }
}
