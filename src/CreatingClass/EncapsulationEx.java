package CreatingClass;

public class EncapsulationEx {
    private int id;
    private double salary;


    public EncapsulationEx(int id, double salary){
        this.id= id;
        this.salary=salary;
    }
    void setId(int id){
        this.id=id;

    }
    public int getId(){
        return this.id;
    }
}
