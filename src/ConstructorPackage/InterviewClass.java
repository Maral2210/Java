package ConstructorPackage;

public class InterviewClass {
    private String name;
    private int score;
    private String finalDecision;
    private int javaPoint;
    private int SQLpoint;
    private int softSkillsPoint;
    public InterviewClass(String name, int score, String finalDecision, int javaPoint, int SQLpoint, int softSkillsPoint){
        this.name=name;
        this.score=score;
        this.finalDecision=finalDecision;
        this.SQLpoint=SQLpoint;
        this.softSkillsPoint=softSkillsPoint;
        this.javaPoint=javaPoint;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getFinalDecision() {
        return finalDecision;
    }

    public void setFinalDecision(String finalDecision) {
        this.finalDecision = finalDecision;
    }

    public int isJavaPoint() {
        return javaPoint;
    }

    public void setJavaPoint(int javaPoint) {
        this.javaPoint = javaPoint;
    }

    public int getSQLpoint() {
        return SQLpoint;
    }

    public void setSQLpoint(int SQLpoint) {
        this.SQLpoint = SQLpoint;
    }

    public int getSoftSkillsPoint() {
        return softSkillsPoint;
    }

    public void setSoftSkillsPoint(int softSkillsPoint) {
        this.softSkillsPoint = softSkillsPoint;
    }
    public double calculateScore(){
        this.score=this.javaPoint+this.softSkillsPoint+this.SQLpoint;
        return this.score;
    }
     /*public String decideResult(){
        if(this.score>100){
            this.finalDecision="Congrats";}
       else {
            this.finalDecision="Please try another time";
            System.out.println(" ");}*/




    @Override
    public String toString() {
        return "InterviewClass{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", finalDecision='" + finalDecision + '\'' +
                ", javaPoint=" + javaPoint +
                ", SQLpoint='" + SQLpoint + '\'' +
                ", softSkillsPoint='" + softSkillsPoint + '\'' +
                '}';
    }
}
