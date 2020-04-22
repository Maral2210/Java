package HashMap;

import java.util.HashMap;

public class April3 {
    public static void main(String[] args) {


        HashMap<Character, Character> hM = new HashMap<>();
        String a = "aabb";
        char x;


        for (int i = 0; i < a.length(); i++) {
            x = a.charAt(i);
            x += i;
            hM.put(a.charAt(i),x);
        }
        
    }}