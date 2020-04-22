package CollectionsTwo;

import java.util.ArrayList;
import java.util.Arrays;

public class SomethingToPrint {
    public static void main(String[] args) {

        ArrayList<String> arr =new ArrayList<>(Arrays.asList("Java", "Python","C++"));
        ArrayList<String> neList= new ArrayList<String>();
        for (String something:neList){
            if(!neList.contains(arr)){
                System.out.println(neList);

            }
        }

        }

}
