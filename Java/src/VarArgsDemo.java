
class Calc{
    public int add(int ... n){  //Variable length arguments
        int sum = 0;
        for (int i : n){
            sum  = sum + i;
        }
        return sum;
    }
}

public class VarArgsDemo {
    public static void main(String[] args) {
        Calc obj = new Calc();
        System.out.println(obj.add(4,8,45,53,6,7,8,4,2,3,23,32,56));
    }
}
