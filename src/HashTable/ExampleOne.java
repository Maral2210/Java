package HashTable;

import java.util.Hashtable;

public class ExampleOne {
    public static void main(String[] args) {
      //  we can use in this way as well =Hashtable<Integer, Hashtable<Integer,Integer> > hstable=new Hashtable<>();
        Hashtable<Integer, String> hsTable=new Hashtable<>();
        hsTable.put(0, "zero");
        hsTable.put(1,"one");
        hsTable.put(2, "two");
        hsTable.put(3,"tree");
        hsTable.put(4, "four");
        hsTable.put(5,"five ");
        hsTable.put(6 , "six");
        hsTable.put(7,"seven");
        hsTable.put(8,"eight");
        hsTable.put(9, "nine");


        System.out.println(hsTable);

    }

}
