package JavaProjects;

import java.util.Scanner;

public class Problem1 {
        public static void main(String[] args){
            Scanner myScanner = new Scanner(System.in);
            System.out.print(" What to wear: ");
            int temperature= myScanner.nextInt();
            if(temperature <= 30 ){
                System.out. println("Wear a jacket ");
            }
            else{
                System.out.println("wear a hat");
            }
        }
    }

