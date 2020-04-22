package Polymorphism;

public class ReviewPoly {
    public static void calculatePerimetr(int edge1, int edge2, int edge3){
        System.out.println("Calculate perimetr"+(edge1+edge2+edge3));
    }
    public static void calculatePerimetr(int edge){
        System.out.println("Perimetr for the Square"+(4*edge));
    }
    public static void calculatePerimetr(double radius){
        System.out.println("Perimetr of circle "+ (2*22/7*radius));
    }
    public void calculateArea(int a , int b ){
        System.out.println("Area of rectangle "+(a*b));
    }
    public void calculateArea(int edge){
        System.out.println("Area of square"+(edge*edge));
    }
    public void calculateArea(double radius){
        System.out.println("Area of circle "+(2*22/7*radius*radius));

    }


    }
