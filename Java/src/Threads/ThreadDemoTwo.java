package Threads;

//Using interface with Threads
class Helloo implements Runnable
{
    public void run() {
        for (int i = 0; i <= 6; i++) {
            System.out.println("Hello Sir");
            try {
                Thread.sleep(400);
            } catch (Exception e) {
            }
        }
    }
}

class Hii implements Runnable
{
    public void run(){
        for (int i=0; i<=6;i++){
            System.out.println("Hi");
            try { Thread.sleep(400); } catch (Exception e){ }

        }
    }
}

public class ThreadDemoTwo
{
    public static void main(String[] args) {

        Runnable obj = new Helloo();
        Runnable obj1 = new Hii();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        try {Thread.sleep(10);} catch (Exception e) {}
        t2.start();
    }
}

