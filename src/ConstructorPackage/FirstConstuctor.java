package ConstructorPackage;

public class FirstConstuctor {
    //creating an attribute
    int x; //class attribute
    //creating class constructor for the MyClass or in this case for the first Constructor
    public FirstConstuctor(){
        //set the initial value for the class attribute x
        x=5; }

    public static void main(String[] args) {
        //create an object of class FirstConstruction (which will be the Constructor)
        FirstConstuctor myObj = new FirstConstuctor();
        System.out.println(myObj);
        //print the value of x



    }
}
