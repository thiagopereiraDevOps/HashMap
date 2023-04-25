import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        //Create HashMap
        Map<String, String> studentGrades = new HashMap<String, String>();

        //Add Key/Value pairs
        studentGrades.put("Alvin", "A+");
        studentGrades.put("Alan", "A");
        studentGrades.put("Becca", "A-");
        studentGrades.put("Sheila", "B+");

        //find element using key
        System.out.println("Becca 's Marks:: "+studentGrades.get("Becca"));

        //remove element
        studentGrades.remove("Becca");

        //Iterate over HashMap
        for (String key: studentGrades.keySet()) {
            System.out.println(key +" :: "+ studentGrades.get(key));
        }
    }
}
