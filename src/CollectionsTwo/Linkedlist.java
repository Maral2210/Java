package CollectionsTwo;

import java.util.Arrays;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> bb = new LinkedList<>(Arrays.asList("Java", "Is", "always", "fun", "one"));
        int longest = 0;
        int index = 0;

        //  int max=0;

        for (int i = 0; i < bb.size(); i++) {
            if (bb.get(i).length() > longest) {
                longest = bb.get(i).length();
                index = i;
            }
        }
        System.out.println("The longest word is: " + bb.get(index));
        findShoerter(bb);


    }
    public static void findShoerter(LinkedList<String> bb){
      int shortest =bb.get(0).length();
      String shortesWord=" ";
        for (int i = 1; i <bb.size() ; i++) {
            if (bb.get(i).length()<shortest){
                shortest=bb.get(i).length();
                shortesWord=bb.get(i);

            }
        }
        System.out.println("the shortest word is :"+ bb.get(shortest));

    }
}
