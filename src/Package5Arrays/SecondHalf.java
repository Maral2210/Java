package Package5Arrays;

class NextQuestion {
    public static void main(String[] args) {
       // bb();
          //public static void bb () {
       // int choose = (int) ((Math.random()) + 1);
        // "if" s below are independent from each other, and they gonna check one by one for printout the result//
          /*    int[] array= new int[5];
              for(int i =0;i<5;i++){
                  array[i]=(int)(Math.random()*10000);
                  System.out.print(+array[i]+", "); }​*/
          /*public class ArrayRandom {
    public static void main(String[] args) {
        createArrayWithRandoms(100);
    }public static void createArrayWithRandoms(int n){
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=1000+(int)(Math.random()*4001);
        }
        //just to see the array elements
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/

          int[] myArray = {1,2,3,4,5,6,7,8,9,10};
          String myArray2 [] = {" hello "};
          for ( int i =0; i<myArray.length; i++); {
            int i = 0;
            myArray[i] =(int) (Math.random()*100);

          }
          for(int number:myArray){
              System.out.println(number);
          }
    }}




