package HashMap;

import java.util.HashMap;

public class CountNumbers {
    public static void main(String[] args) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        numbers.put(2, 7);
        numbers.put(3, 4);
        numbers.put(5, 7);
        //System.out.println(numbers);
     //   frecuenCy(arr);
    }

    public static void frecuenCy( int [] arr){
        HashMap<Integer, Integer> numss= new HashMap<>();
        for (int num:arr) {
            if (!numss.containsKey(num)){
                numss.put(num, 1);
            }
            else {
                numss.put(num, numss.get(num) + 1);
            }
            }
            for (int key :numss.keySet()) {
       //         System.out.println("Number "+key+" = "+freq.get(key)+" times seen in the array");


        }
    }
}
