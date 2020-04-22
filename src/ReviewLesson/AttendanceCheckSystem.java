package ReviewLesson;

public class AttendanceCheckSystem {
    private String studentName;
    private String studentsIDs;
    private boolean weeklyCheck;
    private String daysOfWeek;

    public AttendanceCheckSystem(String studentName, String studentsIDs, boolean weeklyCheck, String daysOfWeek) {
        this.studentName = studentName;
        this.studentsIDs = studentsIDs;
        this.weeklyCheck = true;
        this.daysOfWeek = daysOfWeek;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentsIDs() {
        return studentsIDs;
    }

    public void setStudentsIDs(String studentsIDs) {
        this.studentsIDs = studentsIDs;
    }

    public boolean isWeeklyCheck() {
        return weeklyCheck;
    }

    public void setWeeklyCheck(boolean weeklyCheck) {
        this.weeklyCheck = weeklyCheck;
    }

    public String getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(String daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }
}
