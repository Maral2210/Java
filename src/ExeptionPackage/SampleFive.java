package ExeptionPackage;

public class SampleFive {
    public static void main(String[] args) {
        try {

            int a[]= {1,2,3,4,5};
            System.out.println(a[10]);
        }
        //math
        catch (ArithmeticException e ){
            System.out.println("Arithmetic Exception");
        }
        //references
        catch (NullPointerException e){
            System.out.println("Who is handling");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Ex");
        }
        catch (Exception e){
            System.out.println("Exception");
        }
        System.out.println("the rest of the code");
    }
}
