package Package5Arrays;

public class TwoDementionValues {
    public static void main(String[] args) {

        int array1 [] = {1,2,3,4,5,6,7};
        int array2 []= {2,4,6,9,20};
        commonNumbers(array1,array2);

    }
       /* String b  =" ";
        int bb= (int)(Math.random()*6+1);
        for (int i =0; i<bb;i++);
        bb+=(char)*/

    public static void commonNumbers( int a[], int b[]){
        for (int i =0; i<a.length; i++){
            for (int j=0; i<b.length; j++){
            if (a[i]==b[j]);
                System.out.println(a[i]);

            }
        }
    }
}
