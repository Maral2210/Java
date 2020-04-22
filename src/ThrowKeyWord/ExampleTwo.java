package ThrowKeyWord;

public class ExampleTwo {
    public static void main(String[] args) {
        checkAge(60);
        checkAge(20);
    }
    public static void checkAge(int age) throws ArrayIndexOutOfBoundsException{
        if (age<21){ throw  new ArrayIndexOutOfBoundsException("under 20"); }
        else { System.out.println("Ok "); }

    }
}
