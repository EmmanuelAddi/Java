
 class Finale{
    final int MARK;        //Constant
    public Finale(){
        MARK = 10;
    }
    public final void show(){           //Method Cannot be overridden
        System.out.println("in show");
    }
}

class FinaleTwo extends Finale{
    /*
    public void show(){
        System.out.println("in FinaleTwo show");
    }
     */
}

public class FinalDemo {
    public static void main(String[] args) {
        Finale obj = new Finale();

        System.out.println(obj.MARK);
    }
}
