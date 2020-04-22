package Homeassgmnts;

public class QuestionHexorNot {
    public static void main(String[] args) {
        String a = "1441DEF1123 ";
        boolean hex= true;
        for ( int i =0; i<12; i++) {
            if(a.charAt(i)=='A' ||a.charAt(i)=='D') {
                hex = true;}
            else {
                hex=false;}}

            if(hex) {
                System.out.println("HEXADECIMAL");
            }
            else{
                System.out.println("NoT HEXADECIMAL");


            }
        }

    }

