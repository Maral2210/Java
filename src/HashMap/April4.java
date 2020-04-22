package HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class April4 {
    public static void main(String[] args) {
        HashMap<Character, Character> mp = new HashMap<>();
        String a = "aabb";
        char x;
// here is iteration process going on

        for (int i = 0; i < a.length(); i++) {
            x = a.charAt(i);
            x += i;
            mp.put(a.charAt(i), x);
        }
        Iterator mpIterator = mp.entrySet().iterator();
    }
}
