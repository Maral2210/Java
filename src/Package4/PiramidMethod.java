package Package4;

public class PiramidMethod {
    public static void displayPyramid( ) {
        for (int a = 1; a < 20; a++) {
            for (int j = 1; j < a; j++) {
                System.out.print(" * ");

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        displayPyramid();
        displayPyramid();
    }

}
