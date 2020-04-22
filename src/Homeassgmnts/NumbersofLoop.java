package Homeassgmnts;

public class NumbersofLoop {
    public static void main(String[] args) {
        /// it's suppose to be for 'for' loop
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <2; j++)
                System.out.format("%d ", i);
        }
        System.out.println();
        for (int i = 6; i < 11; i++) {
            for (int j =1; j <2; j++) {
                System.out.format("%d ", i);
            }}
        System.out.println();
         for ( int i =11; i<16; i++){
             for( int j=1; j<2; j++){
                 System.out.format( "%d ", i);
             }
        }
         //while loop
        System.out.println();
         int i =1;
         while (i<16){
             for( int j = 1; j<=15; j++){
                 System.out.println(i + j );
                 i++;
             }
         }
    }}
