package Package5Arrays;

import java.util.Arrays;

public class StringArrayVLesson {
    public static void main(String[] args) {
        int [][] [] numbers = new int[2][3][4];
          numbers [1] [0][0] = 1;
          numbers [1] [1][1]=2;
          numbers[1] [1][2]=1;
        //double[][]doubleLarege = new double[999][999];


        //Arrays.sort(numbers);

        /* int [] numbers = new int [5];
        numbers [0] =2;
        numbers[1]=3;*/
        //System.out.println(numbers.length);
        System.out.println(Arrays.deepToString(numbers));
       // System.out.println(doubleLarege);
}}
