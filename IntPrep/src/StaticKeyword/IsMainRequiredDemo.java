package StaticKeyword;

public class IsMainRequiredDemo {
    public static void main(String[] args) {//You cannot run a Java program without a main method

    IsMainRequired object = new IsMainRequired();
    object.start();

    IsMainRequired.speedInfo();//Since method is static you don't need to create an object to access it

    }
}
