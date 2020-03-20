
abstract class Human{
    public abstract void eat();

    public void walk(){
        System.out.println("Legs ");
    }
}

class Man extends Human{            //Concrete
    public void eat(){
        System.out.println("Vitamins");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Human obj = new Man();

        obj.eat();
        obj.walk();
    }
}
