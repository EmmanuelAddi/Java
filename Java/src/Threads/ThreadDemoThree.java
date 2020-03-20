package Threads;

//Using lambda Expressions
public class ThreadDemoThree
{
    public static void main(String[] args)
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
    }
}

