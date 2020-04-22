package InheritanceEx;

public class Planner {
    String plannerName;
    String [][] dateEvents;
    int index;
    int size;
    Planner(){
        this.plannerName="Default";
        this.dateEvents=new String[10][2];
        this.index=0;
    }
    Planner(String plannerName, int size){
        this.plannerName=plannerName;
        this.dateEvents=new String[size][2];
        this.size=size; this.index=0;
    }
    private void displayPlanner(){
        System.out.println("--Date\t\t--Event--");
        for (String [] events:this.dateEvents){
            System.out.println(events[0]+" \t\t"+events[1]);
        }
             {

        }
    }
     void addEvent(String date, String event){
        if(this.index<this.size){
        this.dateEvents[this.index][0]=date;
         this.dateEvents[this.index][1]=event;
         this.index++;

     }
        else{
            System.out.println("Planner is full");
        }
}}
