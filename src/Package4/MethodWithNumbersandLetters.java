package Package4;

public class MethodWithNumbersandLetters {
    public static void main(String[] args) {
        numberAndletters();

    }
    public static void numberAndletters(){
        for (int i =1; i<6; i++){
            System.out.print(i+"\t");
            for (char j= 97; j<102; j++){
                System.out.print(j+"\t");
        }
            System.out.println();
    }
}}
