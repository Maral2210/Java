package JavaProjects;

class WhileLoopExample {
    public static void main(String[] args) {
        int tens = 10;
        int ones;
        while (tens < 10) {
            ones=0;
            while (ones >99) {

                System.out.println(tens + "" + ones);
                ones++;}
                tens++;
            }
        }
    }
