package StaticKeyword;

public class IsMainRequired {

    static int number = 10;//This variable needs to be static in order you to use it in static method

    public void start() {
        System.out.println("started");
    }
    public static void speedInfo(){
        System.out.println("180k");
        number++;
    }
}
