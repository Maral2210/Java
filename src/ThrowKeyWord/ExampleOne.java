package ThrowKeyWord;

public class ExampleOne {
    public static void main(String[] args) {
        int age=10;
        if (age<20){
            throw new ArithmeticException("Under 20"){

            };
        }
        else{
            System.out.println("No problem");
        }
    }

}
