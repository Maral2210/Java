package Package4;

public class HelloWorldVerti {
    public static void main(String[] args) {
        printVertical("Trying to Love you Java");
    }
    public static void printVertical(String text){

        for(int i=0; i<text.length(); i++){
            System.out.println(text.charAt(i));
        }

    }

}
