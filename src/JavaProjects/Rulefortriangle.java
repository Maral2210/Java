package JavaProjects;

import java.util.Scanner;

public class Rulefortriangle {
        public static void main(String[] args){
            Scanner myScanner = new Scanner(System.in);
            System.out.print(" Rule for Triangle: ");
            int triangle= myScanner.nextInt();
            int A = 2;
            int B =7;
            int C =6;
            if(A+B>C&&A+C>B&&B+C<A){
                System.out. println("Yes ");
            }
            else{
                System.out.println("No");
            }
        }
    }

