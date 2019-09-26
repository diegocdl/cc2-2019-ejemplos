import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<Integer, String>();

        students.put(19004711, "Corado; José");
        students.put(19000262, "Gómez; Marvin");
        students.put(19003302, "Rodas; Yoshua");
        System.out.println("Table: " + students);

        if(students.containsKey(19003303))
            System.out.println("Si existe el Key: 19003303");
        else
            System.out.println("No existe el key: 19003303");

        System.out.println("Keys guardados en mi HashMap");
        for(Integer i : students.keySet())
            System.out.println("\t" + i);

    }
}