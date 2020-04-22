
import java.util.Scanner;

public class Keyboardinput {
    public static void main(String[] args){
        Scanner myKeyboard = new Scanner (System.in);
        int edge1;
        edge1 = myKeyboard.nextInt(3);
        int edge2;
        edge2 = myKeyboard.nextInt(2);
        int edge3;
        edge3 = myKeyboard.nextInt(4);
        System.out.println(edge1+edge2+edge3);
    }

}
