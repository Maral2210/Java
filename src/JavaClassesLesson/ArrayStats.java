package JavaClassesLesson;

import java.util.Arrays;

public class ArrayStats {
    private int min;
    private int max;
    private double avarage;
    private int[] arr;

    public ArrayStats(int min, int max, double avarage, int[] arr) {
        this.min = 0;
        this.max = 0;
        this.avarage = 0;
        this.arr = arr;
    }

    public ArrayStats() {

    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public double getAvarage() {
        return avarage;
    }

    public void setAvarage(double avarage) {
        this.avarage = avarage;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
    public double findAvarage(){
        int total=0;
        for(int i=0; i<this.arr.length; i++){
            total+=this.arr[i]; }
        this.avarage=total/this.arr.length;
        return this.avarage;
    }
    public int findMin(){
        this.min=this.arr[0];
        for (int i=1; i<this.arr.length; i++){
            if(this.arr[i]<this.min){
                this.min=this.arr[i];
            }
        } return this.min;
    }
    public int findMax(int length){
        this.max=this.arr[0];
        for(int i=0; i<this.arr.length; i++){
            if(this.arr[i]>this.max){
                this.max=this.arr[i];
        }
    }return this.max;

}

    @Override
    public String toString() {
        return "ArrayStats{" +
                "min=" + min +
                ", max=" + max +
                ", avarage=" + avarage +
                ", arr=" + Arrays.toString(arr) +
                '}';

    }

    public boolean findMax() {
        return false;
    }
}
