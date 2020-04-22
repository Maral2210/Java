package Polymorphism;

public class AttendenceTest {
    public static void main(String[] args) {
        String[] students = {"13173806 ","13173907","13174001","13174102","13174203"};
        int [] ids = {1,2,3,4,5};
        Attendance myAtt = new Attendance(students,ids);
        myAtt.printWeeklyAttendance();
        myAtt.findTheMaxAttendence();
        myAtt.enterAttendanceToday("TT");
        myAtt.enterAttendanceToday("m");


    }
}