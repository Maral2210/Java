package ExeptionPackage;

public class Multiple3 {
    public static void main(String[] args) {
        String str= null;
        try {
            System.out.println(str.length());
        }
        catch (ArithmeticException e ){
            System.out.println("Arithmetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Array Index out of Bounds");
        }
        catch (Exception e){
            System.out.println(" Parent Exception");
        }
    }
}
