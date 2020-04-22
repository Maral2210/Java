package CollectionsTwo;

import java.util.Arrays;
import java.util.LinkedList;

public class TotalNumbersFFF {
    public static void main(String[] args) {
      LinkedList<String> numbers = new LinkedList<>(Arrays.asList("Bananas 7", "Apple 5", "Plums 4"));
      findDigits(numbers);
      //findDigits(numbers,true);
        findDigits(numbers, true);
      }
      public static void findDigits(LinkedList<String> arr) {
          int total = 0;
          int value = 0;
          String x = "";
          for (String word : arr) {
              for (int i = 0; i < word.length(); i++) {
                  if (Character.isDigit(word.charAt(i))) ;
                  {
                      x += word.charAt(i);
                      value = Integer.parseInt(word);
                      total += value;
                      x = " ";
                  } } }
          System.out.println(); }
      public static void findDigits(LinkedList<String>  arr , boolean x){
          int total = 0;
          int value = 0;
         //String vv = "";
          for (String word : arr) {
              for (int i = 0; i < word.length(); i++) {
                  if (Character.isDigit(word.charAt(i))) {
                      value=word.charAt(i)-48;
                      total+=value;
                  } } }
          System.out.println(total);



      }}

