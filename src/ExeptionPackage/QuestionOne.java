package ExeptionPackage;

import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {}

    public static void divide() {
            Scanner myScan = new Scanner(System.in);
            System.out.println("Numbers for " );
            int first =myScan.nextInt();
        System.out.println("Enter the result");
        int second = myScan.nextInt();
        System.out.println("Enter something");
        try {
            System.out.println("ggg");
        }
        catch (ArithmeticException e){
            System.out.println("ss");
        }
    //write a method and cover the division by zero. ask numbers from user
}}

