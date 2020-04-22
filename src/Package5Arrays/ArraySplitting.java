package Package5Arrays;

public class ArraySplitting {
    public static void main(String[] args) {
        //it dosen't matter if you put arrays right after int or after the name of integer
        int myArray[]= {1,2,3,4,5,6,7,8,9};
        int arrayLane=myArray.length;
        int half = arrayLane/2+1;
        //to find in the middle
        int [] firsthalf= new int[half];
        for (int i= 0; i<half;i++){
            firsthalf[i]=myArray[i];
        }
        //System.out.println(firsthalf[4]);

        int secondHalf[]= new int[myArray.length-half];
        int index=0;
        for (int i=half; i<myArray.length; i++);
        int i = 0;
        secondHalf[index]=myArray[i];
        index++;

    }
}
