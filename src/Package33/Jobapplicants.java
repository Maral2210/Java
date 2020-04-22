package Package33;


import java.util.Scanner;

public class Jobapplicants{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Average age of job applicants : ");
        int age= 20;
        int javaPoint=90;

        if((age<=31&& age>=20)&& javaPoint>=80){
            System.out.println(age*1.5+javaPoint*4.5);
        }
        else if ((age>=20 && age<=30) && javaPoint<80){
            System.out.println(age*1.5+javaPoint*3.5);

        }

        else if ((age>30)&& javaPoint>=80){
            System.out.println(age*1.1+javaPoint*4.5);

        }
        else if ((age>30)&& javaPoint<=80){
            System.out.println(age*1.1+javaPoint*3.5);
        }
        else {
            System.out.format("Please enter the valid  age or javaPoint");

        }

    }}

