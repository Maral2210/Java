package ExeptionPackage;

public class ExampleExeptions {
    public static void main(String[] args) {
        int x = 10;
        int y = 1;
        try {
            System.out.println(x / y);

        } catch (ArithmeticException e) {
            //catch block ignored if try block has no problem
            System.out.println("let's see what's coming up...");
        }
        String s =null;
        try {
            System.out.println(s.length());
        }
        catch (Exception e ){
            System.out.println("kkk");
        }
        String a ="a";
        try {
            int number= Integer.parseInt(a);
        }
        catch (Exception e){
            System.out.println("Sorry couldn't convert");
        }
        int number[]={1,2,3,4,5};
        try {
            System.out.println(number[77]);
        }
        catch (Exception e){
            System.out.println("We don't have index");
        }
        System.out.println("am i invisible? ");

    }}
