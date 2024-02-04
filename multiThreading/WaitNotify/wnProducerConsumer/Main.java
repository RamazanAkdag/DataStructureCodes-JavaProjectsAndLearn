package WaitNotify.wnProducerConsumer;

public class Main {
    public static void main(String[] args) {
        ProducerConsumer producerConsumer = new ProducerConsumer();

        Thread producer = new Thread(new Runnable() {

            @Override
            public void run() {
                producerConsumer.Producer();
            }

        });

        Thread consumer = new Thread(new Runnable() {

            @Override
            public void run() {
                producerConsumer.Consumer();
            }

        });

        producer.start();
        consumer.start();

        try {
            consumer.join();
            producer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
