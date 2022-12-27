
public class test {
    public static void main(String[] args) {
        bListe liste = new bListe();
        liste.basaEkle("adem");
        liste.sonaEkle("ramazan");
        liste.sonaEkle("mami");
        liste.sonaEkle("ahmet");
        liste.sonaEkle("beko");
        liste.sonaEkle("celo");

        // liste.elemanSil(3);
        // liste.elemanSil(6);
        liste.elemanSil2(6);
        // liste.elemanSil(1);

        liste.yazListe();

    }
}