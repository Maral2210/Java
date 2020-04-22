package MethodOverloadingPackage;

public class PriceCalculationWithOverloadMethod {
    public static void main(String[] args) {
        System.out.println(calculateCost(9.43,0.8));
        System.out.println(calculateCost(9.43,0.8,3.67));

    }
    public static double calculateCost(double price, double tax){
        double totalprice = (price+tax)*1.1;
        return totalprice;
    }
    public static double calculateCost(double price, double tax, double shipping){
        double totaleprice= (price+tax)*1.1+shipping;
        return totaleprice;
    }



}
