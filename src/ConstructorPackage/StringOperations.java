package ConstructorPackage;

public class StringOperations {
    String value;
    public StringOperations(){
        this.value=" ";
    }
    public StringOperations(String value){
        this.value=value;
    }
    public String returnReversed(){
        String result=" ";
        for(int i=this.value.length()-1;i>=0; i--){
            result+=this.value.charAt(i);
        }
        return result;
    }
    public String returnCapitalized(){
        //the first thing that u do is concatenate first letter and convert that letter to Upper Case
        String result = " ";
        String firstLetter=" ";
        firstLetter+=this.value.charAt(0); //cc first letter
        System.out.println(result);
        result+=this.value.charAt(0);
        result+=result.toUpperCase();
        String letter=" ";
        for(int i=1; i<this.value.length(); i++){
            if (value.charAt(i-1)==' '){
                //check previous Char if it is space, convert to string using the CCtion and then convert to UpperCase
                letter+=this.value.charAt(i);//converting String
                letter+=letter.toUpperCase(); //converting Upper case
                //then here concatenation with result
                result+=letter; //CC to result
                letter=" "; }//reset for the second word
            else{
                result+=this.value.charAt(i);

            }
        }
        return result;
    }
    @Override
    public String toString() {
        return "StringOperations{" +
                "value='" + value + '\'' +
                '}';
    }

}
