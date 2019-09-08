import java.util.*;
public class String2ArrayTest {
  public static void main(String[] args) {
    String s1 = "hola mundo";
    String s2 = "Chompipe";
    String s3 = "No se :(";

    char[] s1a = String2Array.string2Array(s1);
    char[] s2a = String2Array.string2Array(s2);
    char[] s3a = String2Array.string2Array(s3);

    System.out.println("String: " + s1);
    System.out.println("Array: " + Arrays.toString(s1a));
    System.out.println("------------------------------");

    System.out.println("String: " + s2);
    System.out.println("Array: " + Arrays.toString(s2a));
    System.out.println("------------------------------");
    
    System.out.println("String: " + s3);
    System.out.println("Array: " + Arrays.toString(s3a));
    System.out.println("------------------------------");
  }  
}