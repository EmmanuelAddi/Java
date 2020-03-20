package AccessModifiers;

import Test.Student;

public class InnerDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.rollno = 104;
        //student.marks = 72;
       // student.age = 30;     //not accessible
    }
}
