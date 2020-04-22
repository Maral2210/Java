package CollectionsTwo;

import java.util.ArrayList;

public class CreatingList {
    public static void main(String[] args) {
        String sentences= "Java is fun";
        ArrayList<Character> chars = new ArrayList<>();
        for( int i=0; i<sentences.length(); i++){
            //add is method , something.charAt(i) is parameter
            chars.add(sentences.charAt(i));
        }
        System.out.println(sentences);
    }
}
