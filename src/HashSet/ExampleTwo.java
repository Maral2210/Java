package HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class ExampleTwo {
    public static void main(String[] args) {
            String sentence = "abcde";
        boolean a= true;

        HashSet<Character> hashSet =new HashSet<>();
            hashSet.size();
            char x;
        for (int i = 0; i <sentence.length() ; i++) {
            if (hashSet.contains(sentence.charAt(i)))
                hashSet.add(sentence.charAt(i));

        }

           // String[] txt = new String[hashSet.size()];

            System.out.println(sentence);
    }
}
