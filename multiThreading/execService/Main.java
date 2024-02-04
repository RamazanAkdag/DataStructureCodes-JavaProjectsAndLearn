package execService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);// bir thread havuzu olulturduk ve aynı anda 2
                                                                          // thread çalışabilecek şekilde konfigüre
                                                                          // ettik

        for (int i = 1; i <= 5; i++) {
            executorService.submit(new Worker(String.valueOf(i), i));
        }

        executorService.shutdown();
        System.out.println("bütün işler teslim edildi");
        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        System.out.println("bütün işler bitti");
        /*
         * Thread t1 = new Thread(new Worker("1", 1));
         * Thread t2 = new Thread(new Worker("2", 1));
         * Thread t3 = new Thread(new Worker("3", 1));
         * Thread t4 = new Thread(new Worker("4", 1));
         * Thread t5 = new Thread(new Worker("5", 1));
         * System.out.println("bütün işler teslim edildi");
         * t1.start();
         * t2.start();
         * 
         * try {
         * t1.join();
         * t2.join();
         * } catch (InterruptedException e) {
         * // TODO Auto-generated catch block
         * e.printStackTrace();
         * }
         * t3.start();
         * t4.start();
         * 
         * try {
         * t3.join();
         * t4.join();
         * } catch (InterruptedException e) {
         * // TODO Auto-generated catch block
         * e.printStackTrace();
         * }
         * 
         * t5.start();
         * try {
         * t5.join();
         * } catch (InterruptedException e) {
         * // TODO Auto-generated catch block
         * e.printStackTrace();
         * }
         * 
         * sistemde 100lerce thread olabileceği ihitimalini düşünürsek bu işlem bir
         * hayli uzun ve yönetlilemez olacaktır. Bu sebeple executorService
         * kullabnabiliriz
         */
    }
}
