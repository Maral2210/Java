package HashMap;

import java.util.HashMap;

public class April {
    public static void main(String[] args) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        String a = "aaabbb";
        for (int i = 0; i < a.length(); i++) {
            mp.put((int) a.charAt(i), i);
        }
        System.out.println(mp);
    }

}
