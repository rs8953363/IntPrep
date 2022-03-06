package ThisKeyword;

public class Engine {

    public int number = 20;
    public Engine(){
        System.out.println("Empty constructor");
    }
    public Engine(int vites){
        System.out.println("Parameter constructor");
    }

    public void startEngine(){
        System.out.println("started");
        //Diff btw constructor and method
        //Method can have a same or different name with the classs name but constructor should have the same name with the class.
//Constructor does not return anything. You don't write return type for constructor. If you write, then it would be a method.
// Methods can have a return type or void. Constructors cannot be inherited by a child class but methods can.
        //By using the super keyword, you can call a the constructor, but not a method
    }
}
