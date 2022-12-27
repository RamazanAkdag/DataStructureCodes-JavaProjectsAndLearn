
import java.util.Random;

public class hashRandom {

    public static void main(String[] args) {
        int key, index;
        int diziBoyut = 100;
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
                int ramo = 1;
                while (hashTable[(index + ramo) % diziBoyut] >= 0) {
                    ramo++;
                }
                int yindex = (index + ramo) % diziBoyut;
                hashTable[yindex] = key;
            }

            sayac++;
        }

        for (int i = 0; i < diziBoyut; i++) {
            System.out.println(hashTable[i]);
        }

    }
}