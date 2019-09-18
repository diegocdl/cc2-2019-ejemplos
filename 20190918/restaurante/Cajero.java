package restaurante;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Cajero extends Thread {
    protected static final int SLEEP_TIME = 1500;
    protected static int correlativoCajero = 0;
    protected int id;
    protected ConcurrentLinkedQueue<Integer> bigmacQueue;

    public Cajero(ConcurrentLinkedQueue<Integer> bmQ) {
        super();
        this.id = ++correlativoCajero;
        this.bigmacQueue = bmQ;
    }

    @Override
    public void run() {
        while(true) {
            try {
                if(!bigmacQueue.isEmpty()) {
                    int x = bigmacQueue.remove();
                    System.out.println("Cajero#" + id + " vendio Bigmac#" + x);
                    System.out.flush();
                } else {
                    System.out.println("Cajero#" + id + "No se logro vender por que no habia :(");
                }
                Thread.sleep((int)(Math.random()*SLEEP_TIME));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}