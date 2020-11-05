import java.io.BufferedReader;
import java.io.PrintWriter;

public class ChatServerThread extends Thread {
    protected BufferedReader in;
    protected PrintWriter out;

    public ChatServerThread(BufferedReader in, PrintWriter out) {
        this.in = in;
        this.out = out;
    }

    @Override
    public void run() {
        String txt = "";
        try {
            while(true) {
                txt = in.readLine();
                System.out.println("Recibi: " + txt);
                out.println(txt);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}