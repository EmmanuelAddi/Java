@FunctionalInterface
interface TestOne{
    int num = 8;
    void one();
    static void show(){
        System.out.println("Hello");
    }
}

class TestTwo implements TestOne{
    public void one(){
        int num = TestOne.num;
    }
}

public class StaticMethodDemo {
    public static void main(String[] args) {
        TestOne.show();
    }
}
