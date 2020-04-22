import java.util.HashMap;

public class ReapingWords {
    public static void main(String[] args) {
        String test = " the best way to understand java is the practicing java using java";
      /*  test= test.toUpperCase();
        System.out.println(test);*/
      findReapingOnes(test);
    }
    public static void findReapingOnes(String sentence){
        sentence=sentence.toUpperCase();// convert all chars to Upper case
        String[] words =sentence.split(" ");//convert to String array(1 word in each element)
        //find frequency of the words

        HashMap<String, Integer> wordConter = new HashMap<>();
        for (String word: words){
            if (wordConter.containsKey(word)){
                wordConter.put(word, wordConter.get(word)+1);
            }
            else{
                wordConter.put(word,1);
            } }
        System.out.println("Repeating words ");
        for (String key:wordConter.keySet()){
            if(wordConter.get(key)>1){
                System.out.println("-------"+key+" = \t"+wordConter.get(key) );
        }


        }




        }

    }
