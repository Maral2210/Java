package JavaProjects;

public class MultiplicationTable {
    public static void main(String[] args) {
        for( int i= 1; i<=1; i++){
            for( int j =1; j<=10; j++){
                System.out.println( i+ "X" + j + "=" +(j*i));
            }
        }
        System.out.println();
        System.out.println("-----------------------------------------");

        for( int line =1; line<=9; line++) {
            System.out.print("line" + line + ":");
            for (int st = 1; st <= line; st++) ;
            {
                System.out.print("* ");
            }
            System.out.println();


        }}}
