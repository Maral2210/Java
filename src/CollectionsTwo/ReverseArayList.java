package CollectionsTwo;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArayList {
    public static void main(String[] args) {
       // System.out.println(reverseStr("abc"));
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("java", "Is ", "something"));
        for( int i= arr.size()-1; i>=0; i--){
            System.out.println(reverseStr(arr.get(i)+" "));
        }

    }
    public static String reverseStr(String str) {
        String reversed = " ";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);


        }
        return reversed;
    }
}
