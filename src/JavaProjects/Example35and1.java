package JavaProjects;

import java.util.Scanner;

public class Example35and1 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter starting point: ");
        int start= myScan.nextInt();
        System.out.println("Enter the end point: ");
        int end=myScan.nextInt();
        System.out.println("Enter what you want to print: ");
        String toPoint= myScan.next();
        for( int i =start; i<end; i++){
            System.out.println(toPoint);



        }
    }
}
