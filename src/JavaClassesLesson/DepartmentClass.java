package JavaClassesLesson;

public class DepartmentClass {
    protected String employeeName;
    protected String employeeID;
    protected String position;
    private double salary;

    public DepartmentClass(String employeeName, String employeeID, String position, double salary) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.position = position;
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "DepartmentClass{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeID=" + employeeID +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
    public void changePosition(String newposition){
        this.position=position;
    }
    public double riseSalary(double salary){
        this.salary+=salary;
        return riseSalary(salary);

    }

}
