package ConstructorPackage;
import java.util.Scanner;

public class FirstConstTest {
    public static void main(String[] args) {
        FirstConstuctor myFirst = new FirstConstuctor();
        System.out.println(myFirst.x);
        //creation another object
        FirstConstuctor mySecond = new FirstConstuctor();
        System.out.println(mySecond.x);


    }
}
