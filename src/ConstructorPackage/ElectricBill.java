package ConstructorPackage;

public class ElectricBill implements ElectricBilll {

    int MemberId;
    int counter;
    String name;
    double billAmount;
    public ElectricBill(int memberId, int counter,String name, double billAmount) {
        this.billAmount = billAmount;
        this.counter = counter;
        this.MemberId = memberId;
        this.name = name;
    }
    public void displayBill(){
        this.billAmount=this.counter*1.9;
        System.out.println(this.billAmount);
    }
    public void readCounter(){
        System.out.println(this.counter);
    }
    public void addConsumption(int consumption){
        this.counter+=consumption;
    }
    @Override
    public String toSting(){
        return "Electric Bill: \n"+
                "memberID =\t"+MemberId+
                ", counter =\t"+counter+
                ", name =\t"+name+
                ", billAmount =\t"+billAmount;


    }

}
