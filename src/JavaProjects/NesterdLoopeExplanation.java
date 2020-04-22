package JavaProjects;

public class NesterdLoopeExplanation {
    public static void main(String[] args) {
        /*loop of i*/
        for( int i=0; i<5; i++ ){
            /* loop of j*/
            for( int j =0; j<6; j++){
                /* : ( "outer for loop: " +i+"inner for loop: " +j)*/
                System.out.println("i: " +i+"j: "+j);
            }

        }
    }
}
