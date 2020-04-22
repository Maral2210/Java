package Package5Arrays;

public class FindDublicates {
    public static void main(String[] args) {

    }
    public static boolean isItIntArray(int value, int [] arr) {
        boolean result = false;
        for (int number : arr) {
            if (number == value) {
                result = true;
            }

        }
        return result;
    }

    public static int[] returnDublicate( int [] arr){
    int [] removedDup= new int [arr.length];
    int index=0;
    for(int element:arr){
        // checking is theer any passing element from the duplicates
        if(!isItIntArray(element, removedDup)){
           // removedDup[]=
        }
    }return removedDup;
}
}