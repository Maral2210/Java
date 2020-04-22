package Package;

public class NewMethod2 {
    public static void main(String[] args) {
        wholeNumers();
        printASCII();

    }


    public static void wholeNumers(){
        int start=100;
        while (start<=1000){
            System.out.println(start);
            start++;
        }



    }
    public static void printASCII(){
       for (int i=0; i<256; i++){
           System.out.println("Number"+i+ "Character"+(char)i);
       }

    }
}
