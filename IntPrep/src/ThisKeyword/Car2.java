package ThisKeyword;

public class Car2 extends Engine {

    public int number = 50;

    public Car2(){
        super(6);

        //this keyword is related to a class we are in. SSuper keyword is related to the class we inherited.
        startEngine();
        System.out.println("Car2 Number : "+this.number);//Shows the class we are in. If you don't use this keyword, it prints out 50 on the console.
        System.out.println("Engine Number : "+super.number);
    }
}
