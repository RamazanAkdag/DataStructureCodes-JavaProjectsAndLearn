package ReentrantLock;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockOrnegi {
    private int say = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void artir() {

        for (int i = 0; i < 10000; i++) {
            say++;
        }

    }

    public void thread1Job() {
        System.out.println("Thread1 calisiyor");
        lock.lock();
        try {
            System.out.println("Thread 1 uyandırılmayı bekliyor");
            condition.await();
            artir();// bu artir fonku exception fırlatırsa hiçbir şekilde unloc yapma olasılığımız
                    // olmaz bu da sonsuz bir kilitlemeye sebep olur
                    // bu sebeple try ve finally içine almamız gerekir
        } catch (InterruptedException e) {

            e.printStackTrace();
        } finally {
            lock.unlock();
        }

        // lock.lock ve lock.unlock arasındaki işlemler kilitlenir ve başka threadler
        // giremez içeri
    }

    public void thread2Job() {
        System.out.println("Thread2 calisiyor");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        lock.lock();
        try {
            artir();
            System.out.println("Entera bas devam etmek için");
            scanner.nextLine();
            condition.signal();
            System.out.println("Thread1 i uyandırdım. Ben gidiyrım");
        } finally {
            lock.unlock();
        }
    }

    public void threadOver() {
        System.out.println("say degiskeninin degeri : " + say);

    }

}
