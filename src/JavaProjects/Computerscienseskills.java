package JavaProjects;

import java.util.Scanner;

public class Computerscienseskills {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Check your skills (Java/SQL/Cloud) ");
        String answer = myScanner.next();
        if (answer.equalsIgnoreCase("java")){
            System.out.println("what is your score? (0>=100)");
            int javaScore = myScanner.nextInt();
            if (javaScore>=80);{
                System.out.println("Good job");

            }
             {
                System.out.println("You cant do it!");
            }


        }
        else if(answer.equalsIgnoreCase("SQL")){
            System.out.println("what is your Hakkerenk score(0>1000)");
            int hakkerenkScore=myScanner.nextInt();
            if (hakkerenkScore<500);

        }
        else if (answer.equalsIgnoreCase("Cloud")){
            System.out.println("Do you have certificate(Y/N)?");
            String certificate = myScanner.next();



        }
        else {
            System.out.println("Only Java/SQL/Cloud");
        }
    }

}
