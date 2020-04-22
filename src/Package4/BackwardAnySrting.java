package Package4;

public class BackwardAnySrting {
    public static void main(String[] args) {
        BackwardAndletters();
        BackwardsNumbers();


    }
    public  static void BackwardAndletters() {
        String letter = "abcd";
        for (int i = letter.length()-1; i>=0; i--) {
            System.out.print(letter.charAt(i));
        }
        System.out.println();
    }

        public static void BackwardsNumbers(){
            String numbers = "1234";
            for ( int j= numbers.length()-1; j>=0; j--) {;
            System.out.print(numbers.charAt(j));
            }

    }



    }


