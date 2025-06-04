package Multi_Threading;
class MyRunnable implements Runnable {
    public void run(){
        System.out.println("In Thread");
        // System.out.println(Thread.currentThread().getName() + " In Thread");
    }
}

public class Runnable_Interface {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj);
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            
        }
        System.out.println("In main");
    }
}
