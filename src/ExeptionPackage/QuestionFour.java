package ExeptionPackage;

public class QuestionFour {
    public static void main(String[] args) { String(); }
    //write a method to print anhy word with next letters.
    // Consider null string inputs and take a measure for that
  public static void String(){}

public void printNextLetter(){
    String abc="abc";
    try {
        //String s = null;
       // int count=0;
        for(int i=0; i<abc.length(); i++){
           // char a =abc.charAt(i);
          //  i+=1;
        }
       // System.out.println(s);
    }
    catch (NullPointerException e ){
        System.out.println("String is null");
    }
    }

/*
 DEFINE String string = "The best of both worlds".
SET count =0.
STEP 4: SET i=0. REPEAT STEP 5 to STEP 6 UNTIL i<string.length.
STEP 5: IF (string. charAt(i)!= ' ') then count =count +1.
STEP 6: i=i+1.
STEP 7: PRINT count.
STEP 8: END.*/
}
