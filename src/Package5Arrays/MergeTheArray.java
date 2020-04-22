package Package5Arrays;

public class MergeTheArray {
    public static void main(String[] args) {
        int array1[]={1,2,3,};
        int array2[]={4,5,6,7,8,9};
        mergeArrays(array1,array2);
    }
         static void mergeArrays (int a[], int b[]){
        int lenMergeArrays =a.length+b.length ;
        int [] mergedArray =new int[lenMergeArrays];
        //adding values of the first array
        for(int i =0; i<a.length; i++){
            mergedArray[i]=a[i];}
        //adding elements of the second array
            for ( int i=a.length;i<mergedArray.length; i++){
                int index=0;
                mergedArray[i]=b[index];
                index++;
                //for(int i =0; i<b.length; i ++)
                //mergedArray[i+a.length] = b[i] this is also solution

        }
            //to print(show) elements
            for (int i=0; i<mergedArray.length;i++){
                System.out.println(mergedArray[i]);
            }
    }
}
