package Package5Arrays;

public class CommonsEx {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 5, 6};
        int [] b = new int[]{2,4,9,3};
        commonOnes(a,b);
    }
    public static void commonOnes(int arr1[], int arr2[]){
        //int arr1[] =new int [0];
        //int arr2[] = new int [0];
       // arr1 = arr2;
        for( int i=0; i<arr1.length; i++){
            for (int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j])
                System.out.println(arr1[i]);

            }
        }
    }
}
