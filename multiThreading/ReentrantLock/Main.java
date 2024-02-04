package ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ReentrantLockOrnegi reentrantLock = new ReentrantLockOrnegi();
        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                reentrantLock.thread1Job();
            }

        });
        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                reentrantLock.thread2Job();
            }

        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        reentrantLock.threadOver();

    }
}
