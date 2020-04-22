package JavaProjects;

import java.util.Scanner;

public class Monthtostring {
    public static void main(String [] args){
        Scanner myScan = new Scanner(System.in);
        System.out.println("please enter the month number: ");
        int month = myScan.nextInt();

        String monthText = "null";
        switch (month){
            case 1:
                //System.out.println("June");
                monthText ="January";
                break;
            case 2:
                monthText= "February";
                break;
            case 3:
                monthText = "March";
                break;
            case 4:
                monthText = "April";
                break;
            case 5 :
                monthText = "june";
                break;
            case 6:
                monthText = "May";
            case 7:
                monthText = "July";
                break;
            case 8:
                monthText = "August";
                break;
            case 9:
                monthText = "September";
                break;
            case 10:
                monthText = "October";
            case 11:
                monthText = "November";
            case 12:
                monthText = "december";
            default:
                System.out.println("Only 1-12");
        }
        if (!monthText.equals("x"));
        System.out.println(monthText);
    }

        }


