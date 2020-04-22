package CreatingClass;

public class CipherTester {
    public static void main(String[] args) {
        Cipher myCip=new Cipher();
        System.out.println(myCip.getText());
        System.out.println(myCip.cipherText());
        System.out.println(myCip.toString());
    }

}
