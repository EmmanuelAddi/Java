
class Casio{
    public void add (int a, int b){
        System.out.println(a+b);
    }
    public void add (int a, int b, int c){
        System.out.println(a+b+c);
    }
    public void add (double a, double b){
        System.out.println(a+b);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {

        Casio obj = new Casio();
        obj.add(2,4);
        obj.add(3,5,7);
        obj.add(3.2,2.4);
    }
}
