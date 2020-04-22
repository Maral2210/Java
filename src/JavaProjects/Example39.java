package JavaProjects;

import java.util.Scanner;

public class Example39 {

        public static void main(String[] args) {
            int a = 22;
            Scanner myScanner = new Scanner(System.in);

            int user = myScanner.nextInt();
            while( a!=user){

                        if( user >22) {
                            System.out.println("Larger, try again:");
                        }
                        else if ( user<22){
                            System.out.println("Smaller,try again"  );}

                        else{
                            System.out.println("Congrats.. ");
                        }
            }
                System.out.println("Congrats.. ");
            }
}
