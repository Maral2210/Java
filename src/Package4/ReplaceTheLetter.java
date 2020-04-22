package Package4;

public class ReplaceTheLetter {
    public static void changePlace(String text, char toBereplaced, char toReplace ) {
        String letter = " ";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == toBereplaced) {
                System.out.println(toReplace);
            } else {
                System.out.print(text.charAt(i));
            }
        }}

    public static void main(String[] args) {
        ReplaceTheLetter.changePlace("Hello", 'o', 'e' );
        }
    {

        }
    }