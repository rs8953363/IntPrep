package Overriding;

public class Overriding {
    //Overriding a method that has been inherited is called Overriding
    public static void main(String[] args) {

        Child child = new Child();
        child.communication();
        child.food();

        Parent parent = new Parent();
        parent.communication();
        parent.food();
    }

}
