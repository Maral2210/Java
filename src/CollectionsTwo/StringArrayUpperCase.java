package CollectionsTwo;

import java.util.ArrayList;
import java.util.Arrays;

public class StringArrayUpperCase {
    public static void main(String[] args) {
        //2 dim Array
        ArrayList<ArrayList<String>> text= new ArrayList<>();
        ArrayList<String> a = new ArrayList<>(Arrays.asList("Java", "Is", "Fun"));
        text.add(a);
        text.add(a);
        text.get(1).add("AAAAA");
        findUpperCase(text);
        findLowerCase(text);
        findNumberOfUpperCase(text);

        System.out.println(text);

        System.out.println(text);
    }
    public static void findUpperCase(ArrayList<ArrayList<String>> arr){
        int counterWord;
        int counterRow;
        for(int i=0; i<arr.size(); i++){//to fetch 1 dim String arrays
            counterRow=0;
            for(int j=0; j<arr.get(i).size(); j++){//to fetch String elements
                counterWord =0;
                //whole string array list
                for(int k=0; k<arr.get(i).get(j).length(); k++){// to fetch chars
                    if(Character.isUpperCase(arr.get(i).get(j).charAt(k))){
                        counterWord++;
                    }
                    counterRow+=counterWord;
                }
                System.out.println("there are"+ counterRow+"upper case at row"+counterWord);
            }
        }

    }
    public static void findLowerCase(ArrayList<ArrayList<String>> arr){
        int countinRow;
        int countinWord;
        for(int i =0; i<arr.size(); i++){
            countinRow=0;
            for(int j=0; j<arr.get(i).size(); j++){
                countinWord=0;
                for(int k=0; k<arr.get(i).get(j).length(); k++){
                    if(Character.isLowerCase(arr.get(i).get(j).charAt(k))){
                        countinWord++;
                    }
                    countinRow+=countinWord;
                }
            }
        }
    }
    public static void findNumberOfUpperCase(ArrayList<ArrayList<String>> arr2){
        int coutRoww;
        int countWordd;
        for (int i = 0; i < arr2.size(); i++) {
            coutRoww=0;
            for (int j = 0; j < arr2.get(i).size(); j++) {
                countWordd=0;
                for (int k = 0; k <arr2.get(i).get(j).charAt(k) ; k++) {
                    if(Character.isUpperCase(arr2.get(i).get(j).charAt(k))){
                        countWordd++;
                    }

                }
                System.out.println("There are"+ countWordd+"lower case in "+arr2.get(i).get(j));

            }
        }
    }

}
