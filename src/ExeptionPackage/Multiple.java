package ExeptionPackage;

public class Multiple {
    public static void main(String[] args) {
        int arr[]= new int [5];
        try{
            //java will follow the rule - one line at the time
            arr[5]=9;
            arr [3]=5/0;
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("2nd one");
        }
        catch (Exception e){
            System.out.println("Parent Ex");
        }
        System.out.println("rest of the code");
    }
}
