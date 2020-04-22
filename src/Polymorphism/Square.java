package Polymorphism;

public class Square extends Polygon{
    @Override
    public void calculatePerimetr(int edge) {
        super.calculatePerimetr((4*edge));
    }
}
