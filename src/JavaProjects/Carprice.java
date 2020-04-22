package JavaProjects;

import java.util.Scanner;

public class Carprice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the price of car Model X MRS:");
        String  model = scanner.next();
       int MSRP= 0;
        if(model.equals("Y")) {
            MSRP = 3000;
            System.out.println("Do you need body package: (Y/N)?");
            String body = scanner.next();
            if (body.equalsIgnoreCase("y")){
            MSRP = MSRP+ 5000;
            }
            System.out.println("Would you like to take sound system? ");
            String sound = scanner.next();
            if(sound.equalsIgnoreCase("y")){
            MSRP +=30000;
        }
        else if (model.equals(("Y"))){
            MSRP  = 35000;
        }
        else {
            System.out.println("Sorry we don't have only X or Y ");
        }
        if (MSRP!=0){
            System.out.println("$" + MSRP);
        }
    }

}}