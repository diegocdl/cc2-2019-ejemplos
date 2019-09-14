public class Test {
    /**
     * Test
     * Se tomaba en cuenta que se ordenaria de la siguiente forma
     * Estudiante > Administrativo > Catedratico
     * Si fueran iguales se comparaba por numero de carnet/id
     */
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante(1, "Juan Perez");
        Estudiante e2 = new Estudiante(2, "Maria Jose");
        Catedratico c1 = new Catedratico(1, "Jose Pablo");
        Administrativo a1 = new Administrativo(1, "Juan Carlos");

        
        System.out.println("Objetos: ");
        System.out.println("e1: " + e1);
        System.out.println("e2: " + e2);
        System.out.println("c1: " + c1);
        System.out.println("a1: " + a1);
        
        System.out.println("-----------------------------------");
        System.out.println("Comparaciones: ");
        System.out.println("e1 > c1: " + e1.gratherThan(c1));
        System.out.println("e1 > a1: " + e1.gratherThan(a1));
        System.out.println("e1 > e1: " + e1.gratherThan(e1));
        System.out.println("e1 > e2: " + e1.gratherThan(e2));
        System.out.println("e2 > e1: " + e2.gratherThan(e1));
        
        System.out.println("a1 > e1: " + a1.gratherThan(e1));
        System.out.println("a1 > c1: " + a1.gratherThan(c1));
        
        System.out.println("c1 > e1: " + c1.gratherThan(e1));
    }
}