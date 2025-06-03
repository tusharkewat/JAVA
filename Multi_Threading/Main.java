package Multi_Threading;

class MyThread extends Thread {
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        System.out.println("Hello");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        System.out.println("Byeee");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        System.out.println("Good Byeee");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        System.out.println("Hiii");
    }
}
