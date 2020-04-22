package CollectionsTwo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayChecking {
    public static void main(String[] args) {
        ArrayList<Integer> arr1= new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<Integer> arr2= new ArrayList<>(Arrays.asList(1,2,3,45,5,6,7));
        System.out.println(isIdentical(arr1, arr2));

    }
    public static boolean isIdentical(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        boolean result=true;
        for(int i=0; i<arr1.size(); i++){
            // because of here we have objects that's why its better to use equals equals instead of using symbols"="
            if(!(arr1.get(i).equals(arr2.get(i)))){
                result=false;
            }
        }
        return result;
    }

}
