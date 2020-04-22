package JavaProjects;

import java.util.Scanner;

public class Customersinternetnbill {
    public static void main(String[] args) {
        Scanner mysccanner = new Scanner(System.in);
        System.out.print("Are you subscribed (Y/N)?");
        String member = mysccanner.next();

        if (member.equalsIgnoreCase("Y")) {
            System.out.println(true);
            //ask usage
            int usage = mysccanner.nextInt();
            if (usage<0){

            }
            else if (usage < 101) ;
            System.out.print("$10");
        }


    else {
            System.out.println("40");
                System.out.println("Please subscribe");
            }}}