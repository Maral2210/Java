package MethodOverloadingPackage;

public class OverloadingMethod {
    public static void main(String[] args) {
        printString();
        printString("hello Java ");
        printString("hello Java" , 30);

    }
    public static void printString(){
        for (int i=0; i<=100; i++){
            System.out.println("Hello World");
        }
    }
    public static void printString(String word ){
        for(int i=0; i<100; i++){
            System.out.println(word);
        }
    }
    public static void printString(String word, int a){
        for (int i=0; i<a; i++){
            System.out.println(word);
        }

    }
}
