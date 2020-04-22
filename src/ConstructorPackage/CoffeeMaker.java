package ConstructorPackage;

public class CoffeeMaker {
    public int cupQuantity;
    public int timer;
    private boolean brew;
    public CoffeeMaker(int cupQuantity, int timer){
        this.cupQuantity=cupQuantity;
        //by default timer going to be
        this.timer=0;
        this.brew=true;
    }

    public int getCupQuantity() {
        return cupQuantity;
    }

    public void setCupQuantity(int cupQuantity) {
        this.cupQuantity = cupQuantity;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public boolean isBrew() {
        return brew;
    }

    public void setBrew(boolean brew) {
        this.brew = brew;
    }
    public void resetTimer(){
        this.timer=0;
    }
    public void brewCoffee(){
        if(this.timer==0){
            System.out.println("Start to brew");
        }
        else{
            System.out.println("");
    }
    }



    @Override
    public String toString() {
        return "CoffeMaker{" +
                "cupQuantity=" + cupQuantity +
                ", timer=" + timer +
                ", brew=" + brew +
                '}';
    }
}
