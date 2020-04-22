package CollectionsTwo;

import java.util.ArrayList;

public class FindSimilarities {
    public static void main(String[] args) {
        int myNumers[]= {2,4,6,8};
        ArrayList<Integer> dups=findSimilarities(myNumers);
        System.out.println(findSimilarities(myNumers));

    }
    public static ArrayList<Integer> findSimilarities(int []arr){
       ArrayList<Integer> diffs=new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                diffs.add(Math.abs(arr[i]-arr[j]));
            }
        }
        diffs=findDuplicates(diffs);
        return diffs;
    }
    public static ArrayList<Integer> findDuplicates(ArrayList<Integer> arr){
        //empty Array list
        ArrayList<Integer> duplicates=new ArrayList<>();
        for (int i=0; i<arr.size(); i++) {
            for(int j=i+1; j<arr.size(); j++){
                if(arr.get(i).equals(arr.get(j)) && !duplicates.contains(arr.get(i))){
                    duplicates.add(i);
                }
            }}
        return duplicates;
    }

}

