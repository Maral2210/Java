package ExeptionPackage;

import java.util.Arrays;

public class QuestionSix {
    public static void main(String[] args) {
        int [][] arr1 = {{1,2,3,4},{4,5,6,7},{7,8}};
        for (int [] row:arr1){
            System.out.println(Arrays.toString(row)); }
        System.out.println(Arrays.toString(arr1));

        for(int i=0; i<arr1.length;i++);{
            for (int j=0; j<arr1[0].length; j++){

        try{ int i = 0; System.out.print(arr1[j][i]+"\t"); }
        catch (ArrayIndexOutOfBoundsException e){ System.out.print("    oooiii \t "); }
        finally { System.out.println("Line printed"); }
        }                System.out.println(); }}}
