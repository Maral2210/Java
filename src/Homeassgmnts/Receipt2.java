package Homeassgmnts;

public class Receipt2 {
    public static void main(String[] args){
        float float123 = 2.49f;
        float float124 = 4.79f;
        float float125 = 1.65f;
        float float126 = 7.88f;
        float float127 = 0.99f;
        System.out.format("\t\t Receipt \n");
        System.out.format("---------------------------------\n");
        System.out.format("Item id \t\t quantity \t\t price \n");
        System.out.format(" 123 \t\t\t 1\t\t\t\t $%.2f\n", float123);
        System.out.format(" 125 \t\t\t 2\t\t\t\t $%.2f\n", 2*float125);
        System.out.format("TOTAL:\t\t\t3\t\t\t\t$%.2f\n",float123+2*float125);





    }
}
