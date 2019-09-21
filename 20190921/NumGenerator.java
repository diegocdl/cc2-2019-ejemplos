public class NumGenerator extends Thread {
    protected int x;
    protected int sleep_time;

    public NumGenerator(int x, double time) {
        super();
        this.x = x;
        this.sleep_time = (int)(time / 8);
    }

    @Override
    public void run() {
        for(int i = 0; i < x; i++) {
            try {
                System.out.println("Numero: " + i);
                Thread.sleep(this.sleep_time);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}