package CollectionsTwo;

public class Lesson {
    public static void main(String[] args) {

        char[][] arr = {{'X','_','X'},{'X','O','O'},{'X','O','O'}};
        System.out.println("---------");

        for( int i=0; i<arr.length; i++){
            System.out.print(" |");
            for (int j=0; j<arr[i].length; j++){

            System.out.print(" "+arr[i][j]);
        }
            System.out.println("|");

    }
        System.out.println("-----------");
}


}
