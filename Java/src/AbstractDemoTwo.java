
interface Writer{
    void write();

}

class Pen extends AbstractDemo implements Writer{
    public void write(){
        System.out.println("In a Pen");
    }
}

class Pencil implements Writer{
    public void write(){
        System.out.println("In a Pencil");
    }
}

class Kit{
    public void doSomething(Writer p){
        p.write();
    }
}

public class AbstractDemoTwo {
    public static void main(String[] args) {

        Kit k = new Kit();
        Writer p = new Pen();

        Writer pc = new Pencil();

        k.doSomething(pc);
    }
}
