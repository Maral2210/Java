package Package4;

public class PalindromVoid {
    public static void palindromeCheck(String text ){

        //reversed is a String. "-" or "+" is a concatenation
        String reversed ="";

        for( int i =text.length()-1; i>=0;i--){
            //here will be concatenation operation
            reversed+=text.charAt(i);
        }
        if (reversed.equals(text)){
            System.out.println("Palindrome");}
        else{
            System.out.println(" not Polindrome");
    }
    }



    }
