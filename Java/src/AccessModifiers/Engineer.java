package AccessModifiers;

import Test.Student;

public class Engineer extends Student {

    public void show(){
        marks = 84;
        //age = 55;         //not accessible
    }

    public static void main(String[] args) {

    }
}
