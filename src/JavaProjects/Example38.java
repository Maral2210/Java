package JavaProjects;

import java.util.Scanner;

public class Example38 {
    public static void main(String[] args) {
        int a = 22;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Guess the number: ");
        int user = myScanner.nextInt();
        if( a >=22) {
            System.out.println("Larger, try again:");
        }
        else if ( a<22){
            System.out.println("Smaller,try again"  );}
        else{
            System.out.println("Congrats.. ");
        }

        }


    }
