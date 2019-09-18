package restaurante.cocina;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Cocinero implements Runnable {
    protected static final int SLEEP_TIME = 750;
    protected static int correlativoCocinero = 0;
    protected static int correlativoBigMac = 0;
    protected int id;
    protected ConcurrentLinkedQueue<Integer> bigmacQueue;

    public Cocinero(ConcurrentLinkedQueue<Integer> bmQ) {
        this.id = ++correlativoCocinero;
        this.bigmacQueue = bmQ;
    }

    @Override
    public void run() {
        while(true) {
            try {
                int x = ++correlativoBigMac;
                bigmacQueue.add(x);
                System.out.println("Cocinero#" + id + " preparo Bigmac#" + x);
                System.out.flush();
                Thread.sleep((int)(Math.random()*SLEEP_TIME));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}