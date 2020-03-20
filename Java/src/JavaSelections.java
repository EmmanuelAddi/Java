public class JavaSelections {
    public static void main(String[] args) {
        //If else statement
        int age = 18;

        if (age >= 18){
            System.out.println("You're allowed");
        } else {
            System.out.println("You're not allowed");
        }

        //Ternary operator
        // ?: -> condition?expr2
        int a = 16;
        int g = 10;

        g = a>20?2:4;
        System.out.println(g);

        //Switch Operator
        int e = 4;

        switch (e){
            case 1 :
                System.out.println("One");
                break;
            case 2 :
                System.out.println("Two");
                break;
            case 3 :
                System.out.println("Three");
                break;
            case 4 :
                System.out.println("Four");
                break;
            case 5 :
                System.out.println("Four");
                break;
            default:
                System.out.println("No match");
        }


    }
}
