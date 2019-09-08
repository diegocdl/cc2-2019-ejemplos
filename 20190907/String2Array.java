public class String2Array {
  /**
   * Convierte un String a char array
   * @param s String
   * @return char array of the string given.
   */
  public static char[] string2Array(String s) {
    char[] result = new char[s.length()];

    for(int i = 0; i < s.length(); i++) {
      result[i] = s.charAt(i);
    }

    return result;
  }
}