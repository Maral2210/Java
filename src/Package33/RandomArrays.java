package Package33;

public class RandomArrays {
    public static void main(String[] args) {


    //if the fist letter of the city equals the "A" print it
  }
  public static void printCitiesReversed(String [][] cities){
        for(String row []: cities ){
            for(String city:row){
                System.out.print(cities);
            }
        }
  }
  public static String reverseString(String text){
        String reversed = " ";
        for (int i=text.length()-1; i>=0; i--){
            reversed= reversed+text.charAt(i);
        } return reversed;
  }
  public static void printAtoH (String [] [] cities) {
      for (String[] citiesRow : cities) {
          for (String city : citiesRow) {
              if (city.charAt(0) >= 'A' && 'H' <= city.charAt(0)) {
              }
          }
      }

  }}