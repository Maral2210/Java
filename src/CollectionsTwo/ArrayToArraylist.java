package CollectionsTwo;

import java.util.ArrayList;
//convert array to ArrayList
public class ArrayToArraylist {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(convertToArrayList(arr));

    }
    //input will be int array
    public static ArrayList<Integer> convertToArrayList(int [] arr){
        ArrayList<Integer> result=new ArrayList<>();
        for (int element:arr) {
            result.add(element);

        }
        return result;
    }
}
