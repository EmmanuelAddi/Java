

class Meth{
    public void show(){
        System.out.println("in Meth ");
    }
}

class Over extends Meth {
    public void show() {
        System.out.println("in Over");
    }
    public void config(){
        System.out.println("config");
    }
}

class OverMeth extends Meth {
    public void show() {
        System.out.println("in OverMeth");
    }
}

public class MethodOverriding {
    //Compile time and runtime
    public static void main(String[] args) {
        Meth obj1 = new Over();     //Runtime polymorphism
        obj1.show();

        obj1 = new OverMeth();
        obj1.show();            //Dynamic method dispatch
    }
}
