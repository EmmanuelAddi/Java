
class Demos{
    int n1;
    int n2;
    int result;

    public Demos(){
         n1 = 6;
         n2 = 2;
        System.out.println("In Constructor");
    }
    public Demos(int n){
        n1 = n;
        n2 = n;
    }
    public Demos(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

}

public class Constructors {
    public static void main(String[] args) {

        Demos obj = new Demos(4,5);

        //public Demos(int n1, int n2)
        System.out.println(obj.n1);
        System.out.println(obj.n1);


    }
}
