package ProducerConsumer.BAŞARISIZ;

public class Consumer implements Runnable {

    public void consume() {
        while (true) {
            try {
                System.out.println("consumer başladı");
                Thread.sleep(5000);
                Integer value = ProducerConsumer.blockingQueue.take();

                System.out.println(
                        "Consumer Tüketiyor : " + value + " ||| queue size : " + ProducerConsumer.blockingQueue.size());
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

        }
    }

    @Override
    public void run() {
        this.consume();
    }

    public static void main(String[] args) {
        Thread consumer = new Thread(new Consumer());
        consumer.start();

    }

}
