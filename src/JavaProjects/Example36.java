package JavaProjects;

import java.util.Scanner;

public class Example36 {
        public static void main(String[] args) {
            Scanner myScan = new Scanner(System.in);
            System.out.println("What is the value of variable ");
            int start = myScan.nextInt();
            System.out.println("Enter the point ");

            int end = myScan.nextInt();

            System.out.println("Enter whatever yu want to print ");
            String toPoint = myScan.next();
            for ( int i = start; i<end  ; i++ ) {
                System.out.print(toPoint);



            }}}

