
class Aa{
    public Aa(){
        System.out.println("in Aa");
    }
    public Aa(int i){
        System.out.println("in Aa int");
    }
}

class Bb extends Aa{
    public Bb(){
        super();
        System.out.println("in Bb");
    }
    public Bb(int i){
        super(i);
        System.out.println("in Bb int");
    }

}

public class SuperDemo {
    public static void main(String[] args) {
        Bb obj = new Bb(4);
    }
}
