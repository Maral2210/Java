package Package;

public class RandomNumber2 {
    public static void main(String[] args) {
        choosetheMeal();
        chooseWhatToWear();


    }
    public static void choosetheMeal(){
        //random method starts with "0" so to avoid float numbers 0.3 or 0.3345 like so, so whatever
        int choose= (int)((Math.random()*3)+1);

        // "if" s below are independent from each other, and they gonna check one by one for printout the result//

        if (choose==1){
            System.out.println("Soup");
        }
        if (choose==2){
            System.out.println("Salad");
        }
        if (choose==3)
            System.out.println("Hamburger");
        }
        //
        public static void chooseWhatToWear(){
        int cloth = (int)((Math.random()*4)+1);
        if (cloth==1){
            System.out.println("wear the your green dress");
        }
        if ( cloth==2){
            System.out.println("wear t-shirt and jean");
        }
        if (cloth==3){
            System.out.println("wear red dress");
        }
    }
}
