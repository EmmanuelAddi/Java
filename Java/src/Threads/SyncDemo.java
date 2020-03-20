package Threads;

class Counter{
    int count;

    public synchronized void increment(){
        count ++;
    }
}

public class SyncDemo {
    public static void main(String[] args) throws Exception
    {
        Counter c = new Counter();

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1; i<=1000;i++){
                    c.increment();
                }
            }
        });

        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1; i<=1000;i++){
                    c.increment();
                }
            }
        });

        t.start();
        th.start();

        t.join();
        th.join();

        System.out.println("Count " + c.count);
    }
}
