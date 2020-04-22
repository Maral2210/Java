package ExeptionPackage;

public class Sample {
    public static void main(String[] args) {
        try{
            System.out.println(4/0);
            System.out.println("code");
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
