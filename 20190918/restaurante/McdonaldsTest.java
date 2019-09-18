package restaurante;

public class McdonaldsTest {
    public static void main(String[] args) {
        Mcdonalds mc = new Mcdonalds(2, 4);
        
        while(true) {
            try {
                System.out.println("Cola : " + mc.getQueue2String());
                Thread.sleep(500);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}