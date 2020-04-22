
import java.util.Iterator;
import java.util.TreeMap;

public class ExampleOne {

    public static void main(String[] args) {
        TreeMap<Integer, String> students= new TreeMap();
        students.put(100, "Vahit");
        students.put(100, "Rosemary ");
        students.put(100, "Rose");
        students.put(100, "Bulent");
        Iterator<String> iter = students.values().iterator();
        String value;
        while (iter.hasNext()){
            System.out.println(iter.next()+" = "+students.get(iter.next()));

        }



    }
}
