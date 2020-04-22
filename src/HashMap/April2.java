package HashMap;

import java.util.HashMap;

public class April2 {
    public static void main(String[] args) {


        HashMap<Character, Integer> mp = new HashMap<>();
        String a = "aabb";
        char x;


        for (int i = 0; i < a.length(); i++) {
            x = a.charAt(i);
            x += i;
            mp.put(x, i);
        }
        System.out.println(mp);
    }
}