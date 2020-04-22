package Package4;
  class AnotherName {
    public static void main(String[] args) {


        String password = ("abcdefg");

        System.out.println(password.startsWith(":)"));

        System.out.println(password.length());

        System.out.println(password.endsWith(":)"));

        System.out.println(password.indexOf("a" + "b" + "c" + "d"));

        System.out.println(password.indexOf("pineapple"));
        System.out.println(password.indexOf("l"));
        System.out.println(password.replace(":)", "@"));
        System.out.println(password);
        System.out.println(password.toLowerCase());
        System.out.println(password.toUpperCase());
        System.out.println(password.trim());
        password("password is OK ");
    }
    public static void password(String letters){
        System.out.println(letters);


}}
