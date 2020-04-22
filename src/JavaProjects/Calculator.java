package JavaProjects;
import java.util.Random;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //creating scanner object to read from keyboard

        System.out.println("Please enter C,R< or T");
        String type= scanner.next();
        if(type.compareToIgnoreCase("c")==0);{
            //ask radius from user
            System.out.println("please enter the radius  ");
            double radius= scanner.nextDouble();
            System.out.println(2*3.14*radius);
        }
    }
        }


