package multipleLockSynch;

public class Main {
    public static void main(String[] args) {
        ListWorker listWorker = new ListWorker();

        listWorker.calistir();
        /*
         * long baslangic = System.currentTimeMillis();
         * 
         * listWorker.degerAta();
         * 
         * long bitis = System.currentTimeMillis();
         * System.out.println("gecen sure : " + (bitis - baslangic));
         */

    }
}
