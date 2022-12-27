import java.util.Random;

public class quadratic {

    public static void main(String[] args) {
        int key, index;
        int diziBoyut = 100;
        int cakisma = 0;
        int dolu = 0;

        int[] hashTable = new int[diziBoyut];
        for (int i = 0; i < diziBoyut; i++) {
            hashTable[i] = -1;
        }
        int sayac = 0;
        while (sayac < diziBoyut) {
            Random r = new Random();
            key = 10000 + r.nextInt(90000);
            index = key % diziBoyut;

            if (hashTable[index] < 0) {
                hashTable[index] = key;

            } else {
                cakisma++;
                int k = 1;
                while (hashTable[(index + k * k) % diziBoyut] > 0 && k <= 45000) {
                    cakisma++;
                    k++;
                }
                int yindex = (index + k * k) % diziBoyut;
                hashTable[yindex] = key;

            }
            sayac++;
        }

        for (int i = 0; i < diziBoyut; i++) {
            System.out.println(hashTable[i]);
            if (hashTable[i] > 0) {
                dolu++;
            }

        }
        System.out.println("dolu eleman sayısı : " + dolu);
        System.out.println("cakisma sayisi : " + cakisma);

    }
}