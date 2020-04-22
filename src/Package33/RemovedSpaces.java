package Package33;

public class RemovedSpaces {
    public static void main(String[] args) {
     spaceRemover("Today is the perfect day for Java");
    }
    public static void spaceRemover(String sentence){
    //String spaceR= "It is perfect day to learn Java";
        for( int i =0; i<sentence.length(); i++){
            //if it is not space print it
            if( sentence.charAt(i)!=' '){
                System.out.print(sentence.charAt(i)); }
            else{
                spaceRemover("-");
            }
        } }
}
