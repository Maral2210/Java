package Package4;

public class RemoveGivenLetter {
    public static void main(String[] args ){
        RemoveGivenLetter.removeTheLetter("Hello", 'e');
        System.out.print(" ");


    }
    public static void removeTheLetter(String letter, char e) {
        String text = "";
        char a = 'e';
        for (int i = 0; i < text.length(); i++) {
            text = text + letter.charAt(i);
        }

    }
    public static String removeTheCHar( String text, char letter){
        String removed= "";
        for ( int i= 0; i<text.length(); i++){
            if(text.charAt(i)!=letter){
                removed += text.charAt(i);
            }
        }
      return removed;

            }


        public static void putItbackmethod(String letter, int start, int end){
        for (int i=start; i<= end; i++ ){
            System.out.println(i);
        }

            System.out.println(letter.indexOf("l"));
        }

                }


            // System.out.println(text.replace(":)","@") ); }

