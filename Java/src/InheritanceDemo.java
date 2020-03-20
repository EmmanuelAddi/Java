
class A{        //Super, Parent, Base Class
    public int add(int i, int j){
        return i+j;
    }
}

class B extends A{          //Sub, Child, Derived Class
    public int multi(int i, int j){
        return i*j;
    }
}

class C extends B{
    public int div(int i, int j){
        return i/j;
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        C obj = new C();
        int result1 = obj.add(4,8);
        int result2 = obj.multi(8,4);
        int result3 = obj.div(4,2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
