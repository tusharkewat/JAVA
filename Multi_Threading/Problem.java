package Multi_Threading;

class WithdrwaThread extends Thread {
    static int totalBalance = 1000;
    int amount;

    public WithdrwaThread(int amount) {
        this.amount = amount;
    }

    public void run() {
        synchronized (WithdrwaThread.class) {
            if (totalBalance >= amount) {
                System.out.println("paisa aapke pass aa jayega " + amount);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                totalBalance -= amount;
                System.out.println(totalBalance);
            } else {
                System.out.println("ye gareeb ");
            }
        }

    }
}

public class Problem {
    public static void main(String[] args) {
        WithdrwaThread t1 = new WithdrwaThread(800);
        WithdrwaThread t2 = new WithdrwaThread(500);
        t1.start();
        // try {
        // t1.join();
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        t2.start();
    }
}
