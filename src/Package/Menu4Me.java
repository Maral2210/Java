package Package;

public class Menu4Me {
    public static void main(String[] args) {
        Menu4Me.receipt(1,2,1);
}
public static void receipt (int salad, int meal, int soup){
    double total = 0;
    System.out.println("\t\t----Receipt----");
    if(soup==1){
        System.out.println("Lentil : \t$3.99");
        total+=3.99;
    }
    else if (meal ==1) {
        System.out.println("Rice : \t$7.99");
        total+=7.99;
    }
    if (salad==1) {
        System.out.println("Ceaser : \t$5.99");
        total+=5.99;
    }
    else if (meal==2){
        System.out.println("Beef : \t$10.99");
        total+=10.99;
    //tenner operator
  //  String
    }
    System.out.println("------------"+total);
}}
