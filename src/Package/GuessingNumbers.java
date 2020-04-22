package Package;

import java.util.Scanner;

public class GuessingNumbers {
    public static void main(String[] args) {
        guessThenumber();

    }
    public static void guessThenumber(){
        int number=23;
        Scanner scanner = new Scanner(System.in);
        boolean win = true ;
        System.out.println("Guess first one ");
        while (win){
            int guess = scanner.nextInt();
            if (guess>number) {
                System.out.println("Larger, try again: ");
            } else if (guess<number) {
                System.out.println("Smaller try again ");
            } else {
                System.out.println("congrats");
            }

        }
    }
}
