package Ovideolesson;

public class DoWhileExample {
    public static void main(String[] args) {
        int a =1;
        int j;
        do {
            j = 0;
            do {
                System.out.print("*");
                j++;
            }
            while (j < 20);
            System.out.println();
            a++;
        } while (a<10);
        }
    }
