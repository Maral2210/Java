package Ovideolesson;

public class TriangleT {

    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            for (int j=10; j>= i ; j--) {
                System.out.print("--");

            }
            for (int a = 1; a<= i; a++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }}


