package Package;

public class MortgageLoan {
    public static void main(String[] args) {
        System.out.println(carcalculaterLoan(1200, 160));

        System.out.println(calculatreLoan(400,15));
         monthlyPayment();
        System.out.println(monthlyPayment());
    }
    public static int monthlyPayment(){
        int month = 1000;
        int paymentNumber=22;
        for ( int i =month; i <=0; i++);
        return month = month - paymentNumber;

    }
    public static int calculatreLoan (int monthly, int monthNumber){
        int totalAmount =350000;
       // int restPayment= totalAmount-(totalAmount/monthly);
        int restPayment = totalAmount-monthly*monthNumber;
        return restPayment;
    }
    public static int carcalculaterLoan (int monthly, int totalmonth){
        int totalAmount =45000;
        double insurancePayment = totalAmount-monthly*0.9-totalmonth;
        return (int) insurancePayment;
    }
}
