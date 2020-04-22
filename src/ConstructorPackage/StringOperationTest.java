package ConstructorPackage;

public class StringOperationTest {
    public static void main(String[] args) {
        StringOperations myStr = new StringOperations("Hic bir bok anlamiyorummmma");
        System.out.println(myStr.returnReversed());
        System.out.println(myStr.returnCapitalized());
    }
}
