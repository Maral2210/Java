package Package33;

import java.util.Scanner;

public class Consumption{
        public static void main(String[] args){
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Electric bill : ");
            int consumption= myScanner.nextInt();
            double electriBill;

            if(consumption<500){
                electriBill =consumption*0.3;

            }
            else if (consumption<1001){
                electriBill =consumption*0.4;
            }

            else if (consumption<2001){
                electriBill =consumption*0.5;
            }
            else {
                electriBill = consumption * .6; //without 0 double number are ok
            }
                System.out.format("$%.2f" ,electriBill);

        }}

