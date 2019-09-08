import java.util.*;

public class WordReverse {
  /**
   * Recibe una oracion y retorna la oracion con las palabras invertidas
   * @param s
   * @return string con las palabras invertidas de s
   */
  public static String wordReverse(String s) {
    String result = "";
    Scanner sc = new Scanner(s);
    // se cambia el delimitador por default para que sea solo un espacio
    sc.useDelimiter(" ");
    
    Stack<String> palabras = new Stack<String>();
    while(sc.hasNext()) {
      palabras.push(sc.next());
    }

    while(!palabras.empty()) {
      result += palabras.pop() + " ";
    }

    // quitamos el espacio que agregamos de mas al final
    result = result.substring(0, result.length() - 1);
    return result;
  }


  public static void main(String[] args) {
    String s1 = "uno dos tres          cuatro";
    String s1r = wordReverse(s1);
    System.out.printf("'%s'\n", s1r);
  }
}