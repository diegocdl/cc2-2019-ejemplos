package restaurante;

import java.util.concurrent.ConcurrentLinkedQueue;
import restaurante.cocina.Cocinero;

public class Mcdonalds {
    protected ConcurrentLinkedQueue<Integer> bigmacQueue;
    protected Cajero[] cajeros;
    protected Cocinero[] cocineros;
    protected Thread[] cocinerosThread;
    
    public Mcdonalds(int cantCocineros, int cantCajeros) {
        this.bigmacQueue = new ConcurrentLinkedQueue<Integer>();

        this.cajeros = new Cajero[cantCajeros];
        this.cocineros = new Cocinero[cantCocineros];
        this.cocinerosThread = new Thread[cantCocineros];

        for(int i = 0; i < cantCocineros; i++) {
            Cocinero c = new Cocinero(this.bigmacQueue);
            cocineros[i] = c;
            cocinerosThread[i] = new Thread(c);
            cocinerosThread[i].start();
        }

        for(int i = 0; i < cantCajeros; i++) {
            Cajero c = new Cajero(this.bigmacQueue);
            cajeros[i] = c;
            c.start();
        }
    }

    public String getQueue2String() {
        return this.bigmacQueue.toString();
    }
}