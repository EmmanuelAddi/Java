
class  Demo{
    int n1;
    int n2;
    int result;

    public void perform(){
        result = n1+n2;
    }
        }

public class ObjectDemo {
    public static void main(String[] args) {

       Demo obj = new Demo();
        obj.n1 = 4;
        obj.n2 = 8;

        obj.perform();

        System.out.println(obj.result);
    }
}
