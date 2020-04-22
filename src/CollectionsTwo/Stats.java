package CollectionsTwo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Stats {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<Integer>();
        Random rnd =new Random();
        //System.out.println(rnd.nextInt(1000));
        for(int i=1; i<=10;i++){
            arr.add(rnd.nextInt(10));

        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println("Min number is: "+arr.get(0));
        System.out.println("Max number is: "+arr.get(arr.get(-1)));
        System.out.println("Median number is: "+arr.get(arr.size()/2));
        //System.out.println("Min number is: "+arr.get(0));


    }
}}
