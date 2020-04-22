package JavaClassesLesson;

public class Calculator {
    int Value;

    public Calculator() {
       this.Value = 0;
        System.out.println("Display value "+this.Value);
    }
    protected int add(int a, int b){ return a+b; }
    public int subst(int a, int b){ return a-b; }
    private int divide(int a, int b) { return a/b;}
  int multip(int a, int b ){ return a*b;}

}

