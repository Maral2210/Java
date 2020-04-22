package Package33;

import java.util.Scanner;

public class Gendercomparison {
        public static void main(String[] args){
            Scanner myScanner = new Scanner(System.in);
            System.out.print("User's gender M or F ");
            String gender= myScanner.next();


            if(gender.equals("M")){
                System.out.println("Male");



            }
            else if (gender.equals("F")){
                System.out.println("Female");

            }
            System.out.print(gender.compareTo("F"));



        }}

