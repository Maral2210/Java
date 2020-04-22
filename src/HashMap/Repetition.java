package HashMap;

import java.util.HashMap;

public class Repetition {
    public static void main(String[] args) {
        String digits= "12364749202746447921017468292";
        findRepetition(digits);



    }
    public static void findRepetition( String numbr) {
        HashMap<String, String> nums = new HashMap<>();
        String value;
        for (int i = 0; i < numbr.length(); i++) {
            for (int j = 0; j < numbr.length() + 1; j++) {
                System.out.println();

            }
            int key;

            for (String a:nums.keySet()) {
                System.out.println(a+ "\t\t\t\t" + nums.get(a));
            }
        }
    }}
