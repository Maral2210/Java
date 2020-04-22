package Package4;

public class RandomNUmbers {
    public static void main(String[] args) {



        generetePass();
        int one = 97+(int) (Math.random()*26);
        System.out.print(one);
       /* int count = 0;
        while(count<20){
      generetePass();
      count++;
    }*/
  //  String BB = generatePassword();
   //     System.out.println(BB);
    }



    public static void generetePass() {
        for (int i=0; i<6; i++){

            System.out.print((int)(Math.random()*10));
        }

      /*  public static void generatePassword( ) {
            String BB = "";
            for (int i = 1; i < 6; i++) {
                BB += (int) (Math.random() * 10);

            }*/


        System.out.println();
    }

    public static void lowerCasemethod(int passLen){
        for (int i=1; i<passLen; i++){
            System.out.println((char)(97+(int)(Math.random()*26)));



        }
    }

}
