package Objects;

public class Car {
    int maxSpeed = 200;
    int vites = 5;
    String color = "Blue";

    public Car(){//Constructors are used to create objects. They are similar to methods, but they are not methods.
        System.out.println("Object created");
    }
    public Car (int speed){
        System.out.println("Object is created,  speed : " +speed);
    }


    public void start(){
        System.out.println("Car started");
    }
    public void stop(){
        System.out.println("Car stopped");
    }
    public void cleanWindows(){
        System.out.println("Windows cleaned");
    }
}
