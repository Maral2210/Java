package Package4;

public class PasswordExample {
    public static void main(String[] args) {
        passCheck("iiindnd");
        String password = "iiindnd";
        System.out.println(password.isBlank());

    }

    public static void passCheck(String password) {
        if (password.length() < 6) {
            System.out.println("not ok ");
        } else {
            System.out.println("ok");
        }
    }

}
