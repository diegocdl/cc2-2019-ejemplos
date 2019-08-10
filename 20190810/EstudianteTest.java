public class EstudianteTest {
    public static void main(String[] args) {
        print();
        Estudiante e1 = new Estudiante("Yoshua", 19003303, 99);
        print();
        Estudiante e2 = new Estudiante("kimberly", 19003242, 94);
        print();
        Estudiante e3 = new Estudiante("Juan", 123, 100);
        print();
    }

    
    public static void print() {
        System.out.println("--------------------------------------");
        Estudiante mEstudiante = Estudiante.mejorEstudiante;
        if(mEstudiante != null)
            System.out.println("Mejor Estudiante: " + mEstudiante.getNombre());
        else 
            System.out.println("Mejor Estudiante: No existen estudiantes registrados");
        System.out.println("Impares: " + Estudiante.impares);
        System.out.println("Pares: " + Estudiante.pares);
        System.out.println("--------------------------------------");
    }


}