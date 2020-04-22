package Package33;

public class MethodandCharsandArrays {
    public static void main(String[] args) {
       /* methodIntree('a');
    } public static void methodIntree(char number){
       int counter = 0;
       //char [] numbers = new char[3];
        for(int i =0; i<number.length; i++);
        counter++;
        */
       char [] myFile= {'T', 'o','d','a','y','\0','i','s','\0','f','u','n','\0','d','a','y','\1'};
        System.out.println(countNumberOfChar(myFile));

    } public static int countNumberOfChar(char[]fileArray){
        int numberOfChars=0;
        for (int i =0; i<fileArray.length; i++){
            //increase the counter if current char is not equal to \0 end of the line or the current element of the char array not equal to '1'
            if(fileArray[i]!='\0'|| fileArray[i]!='\1'){
                numberOfChars++;
            }
        } return numberOfChars;
    }


    }
