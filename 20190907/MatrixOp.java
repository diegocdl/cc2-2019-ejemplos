import java.util.*;
public class MatrixOp {

  /**
   * Returna una nueva matriz con la suma de A y B
   * @param A operando1
   * @param B operando2
   * @return A + B
   */
  public static int[][] add(int[][] A, int[][] B) {
    if(A.length == B.length && A[0].length == B[0].length) {
      int[][] R = new int[A.length][A[0].length];
      for(int i = 0; i < A.length; i++) {
        for(int j = 0; j < A[i].length; j++) {
          R[i][j] = A[i][j] + B[i][j];
        }
      }
      return R;
    } else {
      return null;
    }
  }

  /**
   * Retorna la representacion en String de una matriz
   */
  public static String toString(int[][] A) {
    String result = "[";
    for(int[] x : A) {
      result += Arrays.toString(x) + ",";
    }
    result = result.substring(0, result.length() -1);
    result += "]";
    return result;
  }

  /**
   * Prueba del metodo add y del metodo toString
   */
  public static void main(String[] args) {
    int[][] A = {{1, 2}, {3, 4}};
    int[][] B = {{5, 6}, {7, 8}};
    int[][] R = MatrixOp.add(A, B);
    System.out.println("A: " + MatrixOp.toString(A));
    System.out.println("B: " + MatrixOp.toString(B));
    System.out.println("A + B: " + MatrixOp.toString(R));
  }
}