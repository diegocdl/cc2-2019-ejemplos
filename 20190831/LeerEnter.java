import java.io.*;
public class LeerEnter {
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        long numero = 0;

        while(true) {
            System.out.println(numero++);
            if(br.readLine().equals("quit")) {
                break;
            }
        }
    }
}