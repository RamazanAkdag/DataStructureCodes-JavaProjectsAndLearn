import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        oncelikKuyruk queue = new oncelikKuyruk();

        String bankİslem = " 1-havale" + " 2-para cekme" + " 3-para yatırma" + " 4-Western Union";

        queue.siraEkle("ahmet", 1);
        queue.siraEkle("mami", 1);

        queue.siraEkle("umut", 2);
        queue.siraEkle("celo", 3);
        queue.siraEkle("adem", 1);
        queue.siraEkle("şabo", 2);
        queue.siraEkle("beko", 4);

        queue.cikar("celo");

        queue.cek();
        queue.cek();
        queue.cek();
        queue.cek();
        queue.cek();
        queue.cek();

        queue.yazList();

    }
}