package CollectionsTwo;

import java.util.ArrayList;

public class Randoms {
    public static void main(String[] args) {
        String letters = "aehurytbhcdlqwoqwieroernbvcbhsgdysetrue";
      //  System.out.println(letters.charAt((int)(Math.random()*letters.length())));
        ArrayList<String> myString= new ArrayList<>();// empty string array list
        String word =" ";
        for (int i=0; i<100; i++){
            word =" ";
            for (int j = 0; j <5 ; j++){// to concat. characters
            word+=letters.charAt((int)(Math.random()*letters.length()));}
          myString.add(word);}

        System.out.println(myString);
    }
}
