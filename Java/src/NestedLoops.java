public class NestedLoops {

    public static void main(String[] args) {

        for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                System.out.println(" *");
            }
            System.out.println(" ");
        }

        //Patterns
        /*
        1
        1 2
        1 2 3
        1 2 3 4
         */
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.println(j + " ");
            }
            System.out.println(" ");
        }

        /*
        A
        A B
        A B C
         */
        for (int i=1;i<=3;i++){
            for (int j=1;j<=3;j++){
                System.out.println("A");
            }
            System.out.println(" ");
        }

        /*
        $ $ $ $
        $     $
        $     $
        $ $ $ $
         */

        for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                System.out.println("$ ");
            }
            System.out.println(" ");
        }
    }
}
