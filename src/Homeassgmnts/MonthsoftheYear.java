package Homeassgmnts;

public class MonthsoftheYear {
    public static void main(String[] args) {
        for (int month = 1; month < 13; month++) {
            for (int day = 1; day <= 30; day++) {
                System.out.println(month + "/" + day + "/" + "2020");
            }
        }
    }
}