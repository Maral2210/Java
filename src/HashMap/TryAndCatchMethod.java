package HashMap;

import java.util.HashMap;

public class TryAndCatchMethod {
    public static void main(String[] args) {
       String text= "abjshjfhrdgriotutocmv,kmfc";
       findFreq(text);


    }
    public static void findFreq( String str){
        HashMap<Character, Integer> nums= new HashMap<>();
        char key;
        int value;
        for (int i = 0; i <str.length() ; i++) {
            //if i have that key i will increase the value of key
            key=str.charAt(i);
            if(nums.containsKey(str.charAt(i))){
                value=nums.get(key);
                nums.put(key,value+1);// increase 1 value of the key
            }
            else{
                nums.put(key, 1);

            }

        }
        System.out.println(nums);


    }
}
