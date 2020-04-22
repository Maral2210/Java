package HashMap;

import java.util.ArrayList;
import java.util.Iterator;

public class ItaretingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> odds= new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            if(i%2!=0){
                odds.add(i);
            }}/*Iterator<Integer> oddIter = odds.iterator();
        while (oddIter.hasNext()){
            System.out.println(oddIter.next());*/

            Iterator<Integer> oddIter= odds.iterator();

            while(oddIter.hasNext()){
                System.out.println(oddIter.next());

        }
    }


}
