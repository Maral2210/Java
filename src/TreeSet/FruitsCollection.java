package TreeSet;

import java.util.*;
import java.util.function.Consumer;

public class FruitsCollection {
    public static void main(String[] args) {
        List<Integer> nums = new LinkedList<Integer>();
        for (int i = 0; i < 44; i++) {
            nums.add((int) (Math.random() * 100));

        }
        Comparator.reverseOrder();


        System.out.println(Comparator.reverseOrder());
        System.out.println(nums);

        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            System.out.println();
        }
        List<Integer> filling =  new LinkedList<Integer>();
        Collections.copy(filling, nums);
    }
}
