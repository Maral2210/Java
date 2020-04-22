package ExeptionPackage;

public class Muttiple5 {
    public static void main(String[] args) {
        int arr[]=new int [5];
        try{
            arr[5]=40/0;
        }
        catch (Exception e ){
            System.out.println("Common task completed");
        }
        //hierarchy or other words everything should be in order, from specific one to general, otherwise it's gonna give compile error
       // catch (ArithmeticException e){

        }
    }