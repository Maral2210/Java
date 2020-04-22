package ArayWithForEachLoop;

public class Main {
    public static void main(String[] args) {
        String [] array = {"Lilia", "Rose", "Jasmine"};
        int [] array2= {1,2,3,4,5,6,6,7,8};
        // create an object
        Deneme [] array3 = {new Deneme("Rosemary"), new Deneme("Lavender"), new Deneme("Orchids")};

        for (Deneme b :array3) {
            b.write();


        }
        for (int i :array2) {
            System.out.println(i);

        }
        for (String a : array) {
            System.out.println(a);

        }
    }
}
