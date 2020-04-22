package StaticPackage;

public class RetailStore {
    private String product;
    //static is not going to be the part of the object, that's why i cant see in Constructor part
    private static int totalQuantity;
    private int quantity;

    public RetailStore(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        totalQuantity+=this.quantity;
    }
    public void receive(int quan){
        this.quantity+=quan;
        totalQuantity+=quan;
    }
    public void sell(int quan){
        this.quantity-=quan;
        totalQuantity-=quan;
    }
    public void showQuantity(){
        System.out.println(this.product+"= "+this.quantity);
    }
    public static void showTotalQuantity(){
        System.out.println("Total Quantity" + totalQuantity);
    }
}



