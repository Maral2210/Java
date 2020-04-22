package HashSet;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class ExampleOne {
    public static void main(String[] args) {
        String sentence = "Can";
        HashSet<String> hashSet =new HashSet<>();
        //it will never accept duplicate values
        //hashset to array
        hashSet.add("Java is java");
       // hashSet.add("is");
       // hashSet.add("java");
        String[] txt = new String[hashSet.size()];
        hashSet.toArray(txt);
        System.out.println(Arrays.toString(txt));


    }
}
