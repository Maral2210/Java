package Collections;

import java.util.ArrayList;

public class Second {
    public static void main(String[] args) {
        ArrayList<Integer> second= new ArrayList<Integer>();
        System.out.println(second);
        for (int i=0; i<1001; i++){
      second.add(i);
        System.out.println(second);
    }
        for (int a:second){
            System.out.println(a);
        }
}}
