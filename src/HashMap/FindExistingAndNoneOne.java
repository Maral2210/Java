package HashMap;


import java.util.HashMap;

public class FindExistingAndNoneOne {
    public static void main(String[] args) {
        HashMap<String, String> letters = new HashMap<>();
        letters.put("b", "A");
        letters.put("a",  "B");
        letters.put("C", "C");
        System.out.println(iaHasKey(letters, "A"));



    }
    public static boolean iaHasKey(HashMap<String, String>hmap, String keyToCheck){
        boolean result =false;
        for (String key:hmap.keySet()){
            if(key.equals(keyToCheck)){
                result=true;
                break;
            }
        }
        return result;
       
       
       









    }
}
