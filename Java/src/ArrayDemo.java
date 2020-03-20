import javax.swing.*;

public class ArrayDemo {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int b[] = {3, 5, 7, 9};
        int c[] = {0, 3, 4, 5};
        int d[] = {2, 4, 6, 8};

        //jagged Arrays
        int e[][] = {
                    {1, 2, 3, 4},
                    {3, 5, 7},
                    {0, 3},
                    {2, 4, 6, 8}
        };
    /*
        for (int i=0;i<d.length;i++){
            for (int j=0;j<d[i];j++) {
                System.out.println(" " + e[i][j]);
            }
            System.out.println();
        }
     */

        //Enhanced for loop
        for (int k[] :  e){
            for (int l : k){
                System.out.println(" " + l);
            }
            System.out.println();
        }

    }
}
