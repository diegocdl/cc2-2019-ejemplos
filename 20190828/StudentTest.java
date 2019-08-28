import java.util.*;
public class StudentTest {
    public static void main(String[] args) {
        System.out.println("Stack con student's ");
        Student s1 = new Student("Lever", "1");
        Student s2 = new Student("Christian", "2");
        Student s3 = new Student("David", "3");
        Student s4 = new Student("David", "3");
        Stack<Student> stack1 = new Stack<Student>();
        System.out.println("Stack 1: " + stack1);
        stack1.push(s1);
        System.out.println("Stack 1: " + stack1);
        stack1.push(s2);
        System.out.println("Stack 1: " + stack1);
        stack1.push(s3);
        System.out.println("Stack 1: " + stack1);

        // Buscar s4
        System.out.println(stack1.search(s4));

        // con numeros
        System.out.println("Stack con numeros");
        Stack<Integer> stack2 = new Stack<Integer>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        System.out.println("Stack 2: " + stack2);
        System.out.println("Buscando 3: " + stack2.search(3));
    }
}