package ConstructorPackage;

public class ElectricBillTest {
    public static void main(String[] args) {
        //myBill is an object
        ElectricBill myBill =new ElectricBill(13173806, 0,"veteran",0);
        System.out.println(myBill.toSting());
        myBill.addConsumption(33);
        myBill.displayBill();
        myBill.readCounter();
    }
}
