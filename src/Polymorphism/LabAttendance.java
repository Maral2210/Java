package Polymorphism;



public class LabAttendance extends Attendance {
        private String[] labSubjects;
        public LabAttendance(String students[],int[] studentId,String labSubjects[]){
            super(students,studentId);
            this.labSubjects=labSubjects;
        }
        public String[] getLabSubjects(){
            return this.labSubjects;
        }

        //System.out.println()
        //format approach between 11 and 15 >>>100 %3


    }
