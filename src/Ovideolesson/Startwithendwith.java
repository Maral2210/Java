package Ovideolesson;

public class Startwithendwith {
    public static void main(String[] args){
        String message = ("World! Hello!" + ":)" +"!!");

        System.out.println( message.startsWith(":)"));

        System.out.println(message.length());

        System.out.println(message.endsWith(":)"));

        System.out.println(message.indexOf("W" +"H"));

        System.out.println(message.indexOf("pineapple"));
        System.out.println(message.indexOf("l"));
        System.out.println(message.replace(":)","@") );
        System.out.println(message);
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());


    }
}
