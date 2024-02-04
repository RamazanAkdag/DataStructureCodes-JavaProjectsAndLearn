package WaitNotify.wnProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumer {
    private Object lock = new Object();
    private Random random = new Random();
    private Queue<Integer> queue = new LinkedList<>();
    private final int QUEUE_SIZE = 10;

    public void Producer() {

        System.out.println("Producer calisti...");
        while (true) {
            System.out.println();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock) {
                if (queue.size() == 10) {
                    try {
                        System.out.println("Producer tüketimi bekliyor");
                        lock.wait();
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }

                } else {
                    Integer value = random.nextInt(100);
                    queue.add(value);
                    System.out.println(
                            "Producer  üretti : " + value + " ||| Queue Size : " + queue.size());
                    lock.notify();
                }

            }

        }

    }

    public void Consumer() {
        System.out.println("Consumer Calisti");
        while (true) {
            System.out.println();
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock) {
                if (queue.isEmpty()) {
                    System.out.println("Consumer üretimi bekliyor");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }

                } else {
                    Integer value = queue.poll();
                    System.out.println(
                            "Consumer tüketiyor " + value + " ||| queue.size : " + queue.size());
                    if (queue.size() < 10) {
                        lock.notify();

                    }

                }

            }
        }

    }

}
