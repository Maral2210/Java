package MethodOverloadingPackage;

public class Test {
    public static void main(String[] args) {
        System.out.println("Java is fun(from main)");
        Test.main("is it fun"); }
        public static void main(String arg1){
            System.out.println("yes"+ arg1);
    }
    public static void main(String arg1, String arg2){
        System.out.println("Right"+arg1+","+arg2);

    }

}
