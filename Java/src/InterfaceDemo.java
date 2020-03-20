
interface Car{
    void drive();
    void show();
}

class Seat implements Car{
    public void drive(){
        System.out.println("In a Pen");
    }
    public void show(){
        System.out.println("Yeey");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        Car car = new Seat();

        car.drive();
        car.show();
    }
}
