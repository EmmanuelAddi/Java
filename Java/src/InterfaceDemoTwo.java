    /*
    Types of interface
    * Normal
    * Single abstract method - Functional interface - Lambda Expression - Scalar
    * Marker interface

     */
    @FunctionalInterface
interface Practice{
    void show();
}

public class InterfaceDemoTwo {
    public static void main(String[] args) {

        Practice obj  = () -> System.out.println("I'm Happy");      //Lambda Expression

        obj.show();

    }
}
