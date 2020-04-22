package Package33;

class MaxDifference {
    public static void main(String[] args) {

        printMaxDiff(new int[]{1, 2, 4, 5, 12, 34});


    }

    //the question is: for given 1 dim array find the max difference for the adjacent element
    public static void printMaxDiff(int[] arr){
        int diff[]=new int [arr.length];
        for( int i=1; i<arr.length; i++){
            diff[i]=Math.abs(arr[i]-arr[i-1]);
        }
     //how to find the max value of the 1 dimensional array
    int max= diff[0];
        int i =0;
        int index =9;
        //current one and the previous one
        for( int number:diff){
            if(number>max){
                max=number;
                index=i;
            }
        }
        System.out.println("Max difference is " +max +" and indexes are " + index +" " +(+index-1) );
}   }
