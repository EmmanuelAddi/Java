package Threads;

public class ThreadPriority {
    public static void main(String[] args) throws Exception
    {
        Thread t1 = new Thread(() ->
        {
            for (int i = 0; i <= 6; i++) {
                System.out.println("Hello Sir");
                try {Thread.sleep(400);  } catch (Exception e) {}
            }
        }, "Hello Thread");

        Thread t2 = new Thread(() ->
        {
            for (int i=0; i<=6;i++){
                System.out.println("Hi");
                try { Thread.sleep(400); } catch (Exception e){ }
            }
        }, "Hi Thread");

       // t1.setName("Hello Thread");
        // t2.setName("Hi Thread");
        System.out.println(t1.getName());
        System.out.println(t2.getName());

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        try {Thread.sleep(10);} catch (Exception e) {}
        t2.start();

        t1.join();
        t2.join();

        System.out.println(t1.isAlive());
        System.out.println("I'm Out");
    }
}
