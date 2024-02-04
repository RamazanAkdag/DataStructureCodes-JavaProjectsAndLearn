package DeadlockOnlem;

public class Main {
    public static void main(String[] args) {
        DeadlockOrnegi deadlockOrnegi = new DeadlockOrnegi();

        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                deadlockOrnegi.thread1Job();
            }

        });

        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                deadlockOrnegi.thread2Job();
            }

        });
        thread2.start();
        thread1.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        deadlockOrnegi.threadOver();

    }
}
