import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

public class ExampleTwo {
    public static void main(String[] args) {
        TreeMap<Integer, String> pairs = new TreeMap<>(Collections.reverseOrder());
        pairs.put(2, "more");
        pairs.put(4, "me");
        pairs.put(7, "give");
      //  Iterator<String> iter =

        System.out.println(pairs);



    }
}
