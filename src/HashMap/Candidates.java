package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class Candidates {
    public static void main(String[] args) {
        ArrayList<Integer> digists= new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        Iterator<Integer> iterator = digists.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}