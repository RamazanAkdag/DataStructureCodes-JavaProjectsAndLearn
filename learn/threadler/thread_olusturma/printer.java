package thread_olusturma;

public class printer extends Thread {
    @Override
    public void run() {
        System.out.println(isim + " calısıyor...");
        for (int i = 1; i <= 10; i++) {
            System.out.println(isim + " yazıyor... " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                System.out.println("program has a error");
            }
        }
    }

    private String isim;

    public printer(String isim) {
        this.isim = isim;
    }

}
