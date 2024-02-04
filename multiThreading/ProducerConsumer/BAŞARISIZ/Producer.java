package ProducerConsumer.BAŞARISIZ;

import java.util.Random;

public class Producer implements Runnable {
    public Random random = new Random();

    public void produce() {

        while (true) {
            try {
                Thread.sleep(1000);

                Integer value = random.nextInt(100);
                ProducerConsumer.blockingQueue.put(value);
                System.out.println("producer üretiyor  : " + value + " ||| queue size :  "
                        + ProducerConsumer.blockingQueue.size());

            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }

    }

    @Override
    public void run() {
        this.produce();
    }

    public static void main(String[] args) {
        Thread producer = new Thread(new Producer());

        producer.start();

    }

}
