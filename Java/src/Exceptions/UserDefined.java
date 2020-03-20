package Exceptions;

public class UserDefined {
    public static void main(String[] args) {

        int i, j;
        i = 7;
        j = 0 ;

        try {
            int k = i/j;

            if (k==0)
                throw new AddiException("This is not possible ");

            System.out.println(k);
        }
        catch (AddiException e){
            System.out.println("Error " + e.getMessage());
        }

    }
}
