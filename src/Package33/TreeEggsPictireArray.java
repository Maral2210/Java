package Package33;

import java.util.Arrays;

public class TreeEggsPictireArray {
    public static void main(String[] args) {
        int [] [] abc = {{0,18,75,238,255,248},{0,87,255,255,255},{0,75,255,255,249},{0,39,255,255,255,},{0,67,255,255,239} };
        //System.out.println(Arrays.deepToString(abc));
      // friedEggPattern(new int[]{5}, new int[]{5});

    }
    public static void friedEggPattern(int[] arr){
        int eges[][]= new int[arr.length][];
        for( int i=1; i<arr.length; i++){
            eges[i][i-1]=Math.abs(arr[i]-arr[i-1]);
        }
        //how to find the max value of 2 dimensional array
        int max []= eges[0];
        int[] max2 = eges[0];
        int ii =0;
        int index=0;
        //current one and the previous one
        for( int i=0; i<eges.length-1; i++){
            //max=eges[i][0];
            int[] number = new int[0];
            for ( int[] number2:eges)
          //  if(number<max){
                max=number;
               // max2=number2;
                index=i;
            }
}
       // System.out.println("Differences  " +max +" and indexes are " + index +" " +(+index-1) );

}
