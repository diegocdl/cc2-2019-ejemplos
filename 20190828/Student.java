public class Student {
    private String nombre;
    private String carnet;

    public Student(String n, String c) {
        this.nombre = n;
        this.carnet = c;
    }

    @Override
    public boolean equals(Object o) {
        // verificar si el parametro es del tipo Student
        if(o instanceof Student) {
            Student s = (Student)o; // castear a Student
            return this.nombre.equals(s.nombre) && this.carnet.equals(s.carnet);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return carnet + ": " + nombre;
    }
}