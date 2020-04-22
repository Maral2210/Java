package HashMap;

import java.util.HashMap;

public class ExampleForTest {
    public static void main(String[] args) {
        HashMap<Integer, String> years = new HashMap<>();
       years.put(63, "B");
        years.put(60, "A");
        years.put(30, " B1");
        years.put(35, "A2");
        years.put(29, "B3");
        years.put(25, "L");
        years.put(22, "P");
       // System.out.println(years);
       for (Integer key:years.keySet())
             {
                 System.out.println(key+""+years.keySet());}
           String text=" ";
        for (int i = 0; i <years.size() ; i++) {
            if (Character.isDigit(i)){
                text=years.remove(35);
            }
            }

            System.out.println(years.keySet()+" "+years.values());


        }
        {
          //  System.out.println(value+""+ years.keySet()+years.size()+years.get(22));

        }

        }

