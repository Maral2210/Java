package ExeptionPackage;

import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        givenIndex();

    }
    //write a method to print given (ask user) indexes of 2dimensional array and cover bound exceeded error
    public static void givenIndex(){
        String arr [][] = {{"Java", "OPP","Abstractions"},{"Encapsulation", "Inheritance"},{"Interfaces"}};
        Scanner myScan= new Scanner(System.in);
        System.out.print(" Enter index 1:");
        int index1 =myScan.nextInt();
        System.out.print("Enter index 2: ");
        int index2 =myScan.nextInt();
        try{
            System.out.println(arr[index1][index2]);
        }
        catch (Exception e ){
            System.out.println("Invalid index");
        }
    }
}

