package Homeassgmnts;

import java.util.Scanner;

public class NewYear {
    public static void main(String[] args) {
        Scanner myScan= new Scanner(System.in);
        System.out.println("Print all dates for 2020:");
        int firstMonth= 1 ;
        do {
            System.out.println("1/"+ firstMonth + "/" +"2020");
            firstMonth++;
        }
        while(firstMonth<=30);
    }
}
