package Overriding;

public class Child extends Parent {

    @Override
    public void communication(){
        System.out.println("Whatsapp");
    }

    @Override
    public void food(){
        System.out.println("Hamburger");
    }
}
