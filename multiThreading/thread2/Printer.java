package thread2;

public class Printer implements Runnable {
    private String isim;

    public Printer(String isim) {
        this.isim = isim;
    }

    @Override
    public void run() {
        System.out.println(this.isim + "calisiyor");

        for (int i = 0; i < 10; i++) {
            System.out.println(this.isim + " yaziyor :" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }

        System.out.println(this.isim + " isini bitirdi");
    }

}
