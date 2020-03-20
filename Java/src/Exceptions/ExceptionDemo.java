package Exceptions;

public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            int i = 7;
            int j = 0 ;
            int k = i/j;
            System.out.println("Output is :  "+ k);
        }
        catch (ArithmeticException e){
            System.out.println("Error, cannot divide by zero  ");
        }
        finally {
            System.out.println("See you later");
        }
    }
}
