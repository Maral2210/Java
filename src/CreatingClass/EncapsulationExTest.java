package CreatingClass;

public class EncapsulationExTest {
    public static void main(String[] args) {
        EncapsulationEx myTest= new EncapsulationEx(10, 32213);
        System.out.println(myTest.getId());
        myTest.setId(55);
        System.out.println(myTest.getId());
    }
}
