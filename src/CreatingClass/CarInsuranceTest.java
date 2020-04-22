package CreatingClass;

public class CarInsuranceTest {
    public static void main(String[] args) {
        CarInsurance myInsurance=new CarInsurance(2020, 0,0);
        System.out.println(myInsurance.basePrice);
        double myOffer = myInsurance.makeOffer();
        System.out.println(myOffer);
    }
}
