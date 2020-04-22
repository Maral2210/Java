package JavaClassesLesson;

public class ItDepartment extends DepartmentClass {
    public String skillSet;

    public ItDepartment(String employeeName, String employeeID, String position, double salary, String skillSet) {
        super(employeeName, employeeID, position, salary);
        this.skillSet = skillSet;
    }
    void addSkill(String someSkill){
        this.skillSet="SomeTHing";
    }

    public String getSkillSet() {
        return skillSet;
    }

    @Override
    public String toString() {
        return "ItDepartment{" +
                "skillSet='" + skillSet + '\'' +
                '}';
    }
}
