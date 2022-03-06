package StaticKeyword;

public class Cars {
    public static class Engine{}//Nested classes. You can make nested classes by using static keyword

    public static int speed = 200;
    //Since this variable is static you can access it from any other class by writing
    // this class' name. You don't need to create an object.
        public int vites =5;

        static{
            speed = 500;
        }
        public Cars (int a, int i){
            this.speed = a;
            this.vites = i;

        }
}
