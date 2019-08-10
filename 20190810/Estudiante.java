import java.util.*;

public class Estudiante {
    private String nombre;
    private int carnet;
    private double promedio;
    private static int cantEstudiantes;
    public static Estudiante mejorEstudiante;
    public static LinkedList<Estudiante> impares = new LinkedList<Estudiante>();
    public static LinkedList<Estudiante> pares = new LinkedList<Estudiante>();


    public Estudiante(String nombre, int carnet, double p) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.promedio = p;
        cantEstudiantes += 1;
        if(carnet % 2 == 0) {
            pares.add(this);
        } else {
            impares.add(this);
        }

        if(mejorEstudiante == null) {
            mejorEstudiante = this;
        } else if (mejorEstudiante.promedio < p) {
            mejorEstudiante = this;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getCarnet() {
        return carnet;
    }

    public double getPromedio() {
        return promedio;
    }

    public static int getCantEstudiantes() {
        return cantEstudiantes;
    }

    public String toString() {
        StringBuffer s = new StringBuffer();
        s.append("\n\nNombre: ");
        s.append(nombre);
        s.append("\nCarnet: ");
        s.append(carnet);
        s.append("\nPromedio: ");
        s.append(promedio);
        return s.toString();
    }
}