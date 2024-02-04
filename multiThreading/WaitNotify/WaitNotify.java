package WaitNotify;

import java.util.Scanner;

public class WaitNotify {
    private Object lock = new Object();

    public void thread1Function() {
        synchronized (lock) {
            System.out.println("Thread 1 calisiyor...");
            System.out.println("Thread1, Thread2 nin onu uyandırmasını bekliyor...");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread1 uyandi, devam ediyor....");
        }

    }

    public void thread2Function() {
        Scanner scanner = new Scanner(System.in);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (lock) {
            System.out.println("Thread 2 calisiyor....");
            System.out.println("devam etmek için bir tuşa basiniz : ");

            scanner.nextLine();

            lock.notify();// bu diğer threadi uyandıracak fakat diğer thread kendi çalışmadan önce bu
            // threadin işlerini tamamen bitirmesini beklemeli
            System.out.println("uyandirdim abi. Ben gidiyorum, ama 2 sn bekle...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}