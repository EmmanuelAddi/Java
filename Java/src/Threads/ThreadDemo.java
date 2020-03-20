package Threads;

class Hello extends Thread {
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

class Hi extends Thread{
    public void run(){
        for (int i=0; i<=6;i++){
            System.out.println("Hi");
            try { Thread.sleep(400); } catch (Exception e){ }

        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {

        Hello obj = new Hello();
        Hi obj1 = new Hi();

        obj.start();
        try {Thread.sleep(10);} catch (Exception e) {}
        obj1.start();
    }
}
