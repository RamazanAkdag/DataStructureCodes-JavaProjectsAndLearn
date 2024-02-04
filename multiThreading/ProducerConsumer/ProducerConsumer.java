package ProducerConsumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
    Random random = new Random();

    BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

    public void produce() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

            try {
                Integer value = random.nextInt(100);
                queue.put(value);// blocking queue eğer içerisind ebulunan değer 10 olmuşsa orada bekleyecek ve
                                 // başka değer üretmeyecek
                System.out.println("Poducer üretiyor : " + value);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

        }
    }

    public void consume() {
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                Integer value = queue.take();
                System.out.println("consumer tüketiyor : " + value);
                System.out.println("Queue Size : " + queue.size());
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }

}
