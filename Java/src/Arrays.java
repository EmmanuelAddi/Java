
class Student{
    int rollno;
    String name;
}

public class Arrays {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

       //  Student s[] = new Student[4];
        Student s[] = {s1, s2, s3, s4};



        int ages[] = new int[4];
        // int ages[] = {16, 24, 12, 10};
        ages[0] = 16;
        ages[1] = 24;
        ages[2] = 12;
        ages[3] = 10;

        for (int i=0;i<=4;i++){
            System.out.println(ages[i]);
        }

    }
}
