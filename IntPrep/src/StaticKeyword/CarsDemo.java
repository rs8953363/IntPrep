package StaticKeyword;

import StaticKeyword.*;

public class CarsDemo{
    public static void main(String[] args) {
        Cars car1 = new Cars(200, 5);
        Cars car2 = new Cars(250, 6);
        Cars car3 = new Cars(400, 7);

        System.out.println("Car1 vites " + car1.vites);
        System.out.println("Car2 vites " + car2.vites);
        System.out.println("Car3 vites " + car3.vites);

        System.out.println("Car1 speed " + car1.speed);
        System.out.println("Car2 speed " + car2.speed);
        System.out.println("Car3 speed " + car3.speed);

//Cars.Engine();

    }
}
