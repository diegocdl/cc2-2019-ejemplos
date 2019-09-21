public class EjemploThread {
    public static void main(String[] args) {
        try {
            double time = Double.parseDouble(args[0]);
            time *= 1000; // conversion a s->ms
            int cant = Integer.parseInt(args[1]);

            NumGenerator ng = new NumGenerator(cant, time);
            ng.start();
            
            int fraccion_tiempo = (int)(time / 2);
            boolean flag = true;
    
            while(flag) {
                int sleep_time = (int)(Math.random()*fraccion_tiempo);
                if(time < sleep_time)
                    sleep_time = (int)time;
                System.out.println("El Thread dormira por " + sleep_time + " ms");
                Thread.sleep(sleep_time);
                time -= sleep_time;
                if(time <= 0)
                    flag = false;
            }
        } catch(ArrayIndexOutOfBoundsException e1) {
            System.err.println("Error al ejecutar programa cantidad de argumentos invalida:");
            System.err.println("\t Ejemplo: java EjemploThread 1.5 10");
        } catch(NumberFormatException e2) {
            System.err.println("Error ingreso un parametro con formato invalido");
        } catch(Exception e3) {
            e3.printStackTrace();
        }
    }
}