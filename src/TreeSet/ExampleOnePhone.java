package TreeSet;

import java.util.TreeSet;

public class ExampleOnePhone {
    public static void main(String[] args) {
        phoneBook();



    }
    public static void phoneBook(){

        TreeSet<String> phoneNUm= new TreeSet<>();
        phoneNUm.add("John Doe : 555 555 5555");
        phoneNUm.add("Bivilim : 393 434 8832");
        phoneNUm.headSet("t");


                for (String bb: phoneNUm) {
                    System.out.println(bb);
                }

    }
}
