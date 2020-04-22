package Homeassgmnts;

public class Calender {
    public static void main(String[] args) {

        int month = 1;
        int day;
        while (month <= 12) {
            day=1;
            while(day<=30){
                System.out.println(month+"/"+day+"/"+ "2020");
                day++;}
            month++;
            System.out.println("--------------");
            if (month<3 ){
                System.out.print(month+"/"+day+"/"+"2020");
            }

            }

        }
    }
