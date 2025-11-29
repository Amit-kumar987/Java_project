class ThreadOne implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("Thread1");
                Thread.sleep(2000);  // 2000 milliseconds = 2 seconds
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadTwo implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("Thread2");
                Thread.sleep(4000);  // 4000 milliseconds = 4 seconds
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class TwoThreads {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadOne());
        Thread t2 = new Thread(new ThreadTwo());

        t1.start();
        t2.start();
    }
}
