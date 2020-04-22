package ConstructorPackage;

public class CarMaintenance {
   public String carName;
   public int  odometerCurrent;
   public int getOdometerNextOilChange;
   public String airFilterStatus;
   public String cabinFilterStatus;
   public String oilFilterStatus;

    public CarMaintenance(String carName, int odometerCurrent, int getOdometerNextOilChange, String airFilterStatus, String cabinFilterStatus, String oilFilterStatus) {
        this.carName = carName;
        this.odometerCurrent = odometerCurrent;
        this.getOdometerNextOilChange = getOdometerNextOilChange;
        this.airFilterStatus = airFilterStatus;
        this.cabinFilterStatus = cabinFilterStatus;
        this.oilFilterStatus = oilFilterStatus;
    }

    public CarMaintenance() {

    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getOdometerCurrent() {
        return odometerCurrent;
    }

    public void setOdometerCurrent(int odometerCurrent) {
        this.odometerCurrent = odometerCurrent;
    }

    public int getGetOdometerNextOilChange() {
        return getOdometerNextOilChange;
    }

    public void setGetOdometerNextOilChange(int getOdometerNextOilChange) {
        this.getOdometerNextOilChange = getOdometerNextOilChange;
    }

    public String getAirFilterStatus() {
        return airFilterStatus;
    }

    public void setAirFilterStatus(String airFilterStatus) {
        this.airFilterStatus = airFilterStatus;
    }

    public String getCabinFilterStatus() {
        return cabinFilterStatus;
    }

    public void setCabinFilterStatus(String cabinFilterStatus) {
        this.cabinFilterStatus = cabinFilterStatus;
    }

    public String getOilFilterStatus() {
        return oilFilterStatus;
    }

    public void setOilFilterStatus(String oilFilterStatus) {
        this.oilFilterStatus = oilFilterStatus;
    }

    //methods below
    public void displayFilterStatus() {
        String status = "\t\t\t FILTER STATUS \n" +
                "Air Filter : \t" + this.airFilterStatus + "\n" +
                "Cabin Filter : \t" + this.cabinFilterStatus + "\n" +
                "Oil Filter : \t" + this.oilFilterStatus;
        System.out.println(status);
    }
    public void doOilChange(){
        if(this.oilFilterStatus.equalsIgnoreCase("new")&&this.getOdometerNextOilChange-this.odometerCurrent<=0){
            this.oilFilterStatus="new";}
        else {
            System.out.println("no need for change");
        }



    }

    @Override
    public String toString() {
        return "CarPrice{" +
                "carName='" + carName + '\'' +
                ", odometerCurrent=" + odometerCurrent +
                ", getOdometerNextOilChange=" + getOdometerNextOilChange +
                ", airFilterStatus='" + airFilterStatus + '\'' +
                ", cabinFilterStatus='" + cabinFilterStatus + '\'' +
                ", oilFilterStatus='" + oilFilterStatus + '\'' +
                '}';
    }
}
