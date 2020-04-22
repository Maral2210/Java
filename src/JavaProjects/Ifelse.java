package JavaProjects;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Print a year : ");
        int year= myScanner.nextInt();

        if(year>2020){
            System.out.println("After Milenium ");
        }
        else{
            System.out.println("Before Milenium");
        }
    }
}
