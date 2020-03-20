
@FunctionalInterface
interface Demoo{
    void demo();
    default void show(){
        System.out.println("In Demoo show");
    }
}

interface MyDemo{
    default void show(){
        System.out.println("In MyDemo show");
    }
}

class DemooImp implements Demoo, MyDemo{
    public void demo(){
        System.out.println("In DemooImp");
    }
    @Override
    public void show(){
        Demoo.super.show();
    }
}

public class DefaultDemo {
    public static void main(String[] args) {
        Demoo obj = new DemooImp();
        obj.demo();
        obj.show();
    }
}
