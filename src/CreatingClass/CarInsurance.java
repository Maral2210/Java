package CreatingClass;

public class CarInsurance {
    private int modelYear;
    private int numberOfTickets;
    private  int numberOfAccidents;
    private double offer;
    final double basePrice=99.9; //this modifier we call as non.... once u declare we have to initilize verable and you cant change anymore
    public CarInsurance(int modelYear, int numberOfTickets, int numberOfAccidents){
        this.modelYear=modelYear;
        this.numberOfTickets=numberOfTickets;
        this.numberOfAccidents=numberOfAccidents;
        this.offer=0;
    }
    public void setModelYear(int modelYear){
        this.modelYear=modelYear;
    }
    public int getModelYear(){
        return this.modelYear;
    }
    public void setNumberOfTickets(int tickets){
        this.numberOfTickets=tickets;
    }
    public int getNumberOfTickets(){
        return this.numberOfTickets;

    }
    public void setNumberOfAccidents(int accidents){
        this.numberOfAccidents=accidents;
    }
    public int getNumberOfAccidents(){
        return this.numberOfAccidents;
    }
    public void setOffer(int offer){
        this.offer=offer;
    }
    public double getOffer(){
        return this.offer;
    }
    //creating a method
    public double makeOffer(){
        int year = 0;
        this.offer=this.basePrice+(year-this.modelYear)*50+(30*this.numberOfTickets)+(100*this.numberOfAccidents);
        return 0;
    }

}
