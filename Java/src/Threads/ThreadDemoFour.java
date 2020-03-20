package Threads;

//Using Join / isAlive methods
public class ThreadDemoFour
{
    public static void main(String[] args) throws Exception
    {
        Thread t1 = new Thread(() ->
        {
            for (int i = 0; i <= 6; i++) {
                System.out.println("Hello Sir");
                try {Thread.sleep(400);  } catch (Exception e) {}
            }
        });

        Thread t2 = new Thread(() ->
        {
            for (int i=0; i<=6;i++){
                System.out.println("Hi");
                try { Thread.sleep(400); } catch (Exception e){ }
            }
        });

        t1.start();
        try {Thread.sleep(10);} catch (Exception e) {}
        t2.start();

        t1.join();
        t2.join();

        System.out.println(t1.isAlive());
        System.out.println("I'm Out");
    }
}

