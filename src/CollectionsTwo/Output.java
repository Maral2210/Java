package CollectionsTwo;

import java.util.LinkedList;

public class Output {
    public static void main(String[] args) {
     /*   int $ = 5;
        $++;
        System.out.println($);*/
        LinkedList<Integer> list= new LinkedList<>(); // empty list
        list.add(1);
        list.add(4);
        list.add(7);
        list.add(5);

        for (int i = 0; i <list.size(); i++) {
            System.out.println(list);

        }
    }

}
