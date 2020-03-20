
class Emp{
    int eid;
    int salary;
    static String director;

 /*
                //Executed When you load a class
    static {
        director = "Addi";
    }
                //Executed when you create an object
    public Emp(){
        eid = 2;
        salary = 2000;
    }
  */

    public void show(){
        System.out.println(eid +  " : " +salary+ " : " + director);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
         Emp Bett = new Emp();
         Bett.eid = 126;
         Bett.salary = 5688;
         Bett.director = "Mahesh";

         Emp Kip = new Emp();
         Kip.eid = 132;
         Kip.salary =7676;
         Kip.director = "Mahesh";

         Emp.director= "Nikita";

         Bett.show();
         Kip.show();

    }
}
