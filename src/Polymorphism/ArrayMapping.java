package Polymorphism;


    public class ArrayMapping {
        public static void main(String[] args) {
            String[] students = {"Birsen","Esra","Inci","Mehmet","Nihal"};
            String days[] = {"Mon","Tue","Wed","Thu","Fri"};
            int[][] attendance = new int[5][5];
            for (int i = 0; i < days.length ; i++) {
                System.out.print(days[i]+"\t\t");
                for (int j = 0; j <students.length ; j++) {
                    System.out.print(attendance[i][j]+"\t");
                }
                System.out.println();
            }

        }

    }
