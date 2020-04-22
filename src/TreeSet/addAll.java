package TreeSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class addAll {
    public static void main(String[] args) {
        List fruits = new ArrayList();
        Collections.addAll(fruits,"Apples","Oranges","Banana");
        Iterator<Integer> iter = fruits.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}


