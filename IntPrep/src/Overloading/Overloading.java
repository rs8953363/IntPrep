package Overloading;

public class Overloading {
    //Creating more than one method or constructor with the same name is called Overloading

    public Overloading(){}//constructor
    public Overloading(int num){}//Consructor with same name. This one has parameter
    public Overloading(int num, String name){} //Constructor with same name but different parameter

    public static void main(String[] args) {
        add(20, 30);
        add(20, 30, 40);
    }

    public static void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    public static void add (int num1, int num2, int num3){
        System.out.println(num1+num2+num3);
    }
}
