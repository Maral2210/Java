package Package5Arrays;

public class MaxValueForIn {
    public static void main(String[] args) {
        /*int myArray [] = {1,2,3,4,5,6,7,8,9};
        int arrayLen = myArray.length;
        //to find the middle
        int half =arrayLen/2+1;
        int [] firsthalf= new int[half];
        System.out.println(myArray);*/

        int arrayInt[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String arrayString[] = {"Hello", "Java", "It", "Is", "Fun"};
        for (int number : arrayInt) {
            System.out.println(number);
        }
        for (String word : arrayString) {
            System.out.println(word);
        }


    }
}

