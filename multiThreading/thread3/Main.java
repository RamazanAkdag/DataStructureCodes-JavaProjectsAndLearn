package thread3;

public class Main {

    public static void main(String[] args) {
        System.out.println(":main thread calisiyor");
        Thread printer1 = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("thread calisiyor");

                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread yaziyor :" + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                }

                System.out.println("Thread isini bitirdi");
            }

        });
        printer1.start();
    }

}
