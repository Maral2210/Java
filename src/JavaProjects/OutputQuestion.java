package JavaProjects;

import java.util.Scanner;

public class OutputQuestion {
    public static void main( String[] args ){
        Scanner user = new Scanner(System.in);
        System.out.println("This this a Math or Art?");
        String chose = user.next();
        String X = "Art";

        if (chose.equalsIgnoreCase("math") ){

            System.out.println("Tutor (y/n) ");
            String tutor = user.next();
            if (tutor.equalsIgnoreCase("y"))
            System.out.println("OK");
        else if (tutor.equalsIgnoreCase("n")){
                System.out.println("study yourself: ");}
        else {
                System.out.println("y or n please! ");

            }

        }
        else if  (chose.equalsIgnoreCase("art")){
            System.out.println("nice job");
        }
        else {
            System.out.println("only Math or Atr");
        }


    }
}
