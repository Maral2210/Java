package JavaClassesLesson;

public class DesingPaint {
   // protected String colorName;
    protected double sqFeet;
    protected double totalPrice;

    public DesingPaint(String colorName, double sqFeet, double totalPrice) {
        //this.colorName = colorName;
        this.sqFeet = sqFeet;
        this.totalPrice = totalPrice;
    }
      double calculatePrice(double totalPrice){
        this.totalPrice= this.sqFeet/100*32.99;
        this.totalPrice=totalPrice;
        return totalPrice;

    }
}
