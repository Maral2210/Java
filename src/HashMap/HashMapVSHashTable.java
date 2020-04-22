package HashMap;

import java.util.Hashtable;

public class HashMapVSHashTable {
    public static void main(String[] args) {
       /* HashMap<String, String> hm= new HashMap<>();
        Hashtable<String, String> ht= new Hashtable<>();
        //Hmap accsepts null in key and value
        hm.put(null, "one");
        hm.put("two", null);
        hm.put("Tree", null);
        //HTable does not allow to put null either in key or values
        ht.put("one", null);*/

        System.out.println(deleteKeyLargerOne());
    }

        public static Hashtable<Integer, Integer> deleteKeyLargerOne(){
        Hashtable<Integer, Integer> table = new Hashtable<>();

            for (int i = 0; i <11 ; i++) {
                table.put(i,i*2);
                Integer iterator = table.size();
                while (table.containsKey(7)) {
                    System.out.println(table.remove(7));

            }
                System.out.println();

            } return table;
    }}
