package Homeassgmnts;

public class AlphabetExample {


        public static void main(String[] args) {
            char a = 'a';
            for( int i = 1; i<6; i++ ){
                System.out.print(i);
                char letter = 'a';
                for( char j=1 ; j<5; j++){
                    System.out.format("\t"+a+"\t");
                    a++;
                }
                System.out.println();

            }
        }}

