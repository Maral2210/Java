package HashMap;

import java.util.HashMap;

public class QuestionOne {
    public static void main(String[] args) {
        // start from the empty HashMap
        HashMap<String, String > first =new HashMap<>();
        first.put("Java", "medium");
        first.put("SQL", "junior");
        first.put("Selenium", "expert");
        first.put("Cucumber", "master");
        System.out.println(first);
        for (String key:first.keySet()) {
            System.out.println(key+"\t"+first.get(key));
            createHashMap();
        } }
    public static void createHashMap(){
        HashMap<String, Integer> second= new HashMap<>();
        second.put("Los Angeles", 85);
        second.put("Chicago", 30);
        second.put("Denver", 55);
        second.put("Orlando", 90);
       // second.keySet()
        System.out.println(second);
        for (String key:second.keySet()) {
            System.out.println(key + "\t\t\t\t" + second.get(key));
        }
        double avarage;
        int total=0;
        for (int temp:second.values()) {
            total += temp;
        }
        avarage=total/second.size();

            System.out.println("Average Temperature: %.2.f"+ avarage);


        }
    }

