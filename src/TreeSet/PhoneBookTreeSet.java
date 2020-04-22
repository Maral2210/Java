package TreeSet;

import java.lang.reflect.Array;
import java.util.*;

public class PhoneBookTreeSet {
    public static void main(String[] args) {
        TreeSet<String> phoneBook = new TreeSet<String>(Arrays.asList("John Doe : 333 444 2222"));
        System.out.println(phoneBook);
        List<String> name = new ArrayList<>(Arrays.asList("Bivil : 777 777 7777", "Husband: 555 555 2222 "));
        phoneBook.addAll(name);
        System.out.println(phoneBook);

        Iterator<String> iterator = phoneBook.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
