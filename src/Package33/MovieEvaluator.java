package Package33;

public class MovieEvaluator {
    public static void main(String[] args) {
        decideMovie(5,6888,154.000);
        carRange(29.6, 33);

    }
    public static void decideMovie (double imdb , int totalVotes, double boxOffice){
        if((imdb*totalVotes/boxOffice)>10){
            System.out.println("watch the movie");
        }
        else {
            System.out.println("Do not watch the movie");
        }
    }
         public static int carRange(double MPG, double tank){
          return (int)(MPG*tank);

        }
    }
