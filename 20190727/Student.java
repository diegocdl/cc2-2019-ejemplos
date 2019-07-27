/*
    Student
    Declare los siguientes encapsulados: 
            carnet, nombre, apellido, carrera, promedio
    Haga dos constructores con las siguientes firmas
            Student(carnet, nombre, apellido, carrera, promedio)
            Student(carnet, nombre, apellido, carrera) // promedio = 0.0
    Haga getters y setters para los siguientes campos:
            nombre, apellido, carrera, promedio
    Declare un metodo getDistincion() que devuelva un string dependiendo del promedio
            95 - 100 Summa Cum Laude
            90 - 94 Magna Cum Laude
            85 - 89 Cum Laude 
            si no tiene distincion devolver "No tiene distincion"
    Declare un metodo getNombreCompleto() que devuelva el nombre con el formato
            nombre, apellido
    Declare el metodo toString que imprima el objeto con el siguiente formato
            carnet  apellido, nombre    carrera    ____________
*/

public class Student {
    private String carnet, nombre, apellido, carrera;
    private double promedio;

    public Student(String carnet, String nombre, String apellido, String carrera, double prom) {
        this.carnet = new String(carnet);
        this.nombre = new String(nombre);
        this.apellido = new String(apellido);
        this.carrera = new String(carrera);
        this.promedio = prom;
    }

    public Student(String carnet, String nombre, String apellido, String carrera) {
        this(carnet, nombre, apellido, carrera, 0.0);
    }

    public String getCarnet() {
        return carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = new String(nombre);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = new String(apellido);
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = new String(carrera);
    }

    public String getDistincion() {
        if (promedio >= 95 && promedio <= 100) {
            return "Summa Cum Laude";
        } else if (promedio >= 90 && promedio <= 94) {
            return "Magna Cum Laude";
        } else if (promedio >= 85 && promedio <= 89) {
            return "Cum Laude";
        } else {
            return "No tiene distincion";
        }
    }

    public String getNombreCompleto() {
        return nombre + ", " + apellido;
    }

    public String toString() {
        String formato = "%s    %s, %s  %s  ___________________";
        String resultado = String.format(formato, carnet, apellido.toUpperCase(), 
                                                    nombre.toUpperCase(), carrera);
        return resultado;
        // return carnet + "   " + apellido.toUpperCase() + ", " + nombre.toUpperCase()
        //             + "     " + carrera + "   _____________________";
    }
}