import java.io.BufferedReader;
import java.io.DataOutputStream;

public class ChatServerThread extends Thread {
    protected BufferedReader in;
    protected DataOutputStream out;

    public ChatServerThread(BufferedReader in, DataOutputStream out) {
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
                out.write((txt + "\n").getBytes());
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}