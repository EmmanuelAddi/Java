
class Anonymous{
    public void show(){
        System.out.println(" In show Ab");
    }
}

public class AnonymousInnerDemo {
    public static void main(String[] args) {
        Anonymous obj = new Anonymous() {
            public void show(){
                System.out.println(" I'm the Best");
            }
        };
        obj.show();
    }
}
