import java.util.Hashtable;
import java.util.Random;

public class bagliHash {

    public static void main(String[] args) {
        int diziBoyut = 100;
        int key, index;

        dugum[] hashTable = new dugum[diziBoyut];
        for (int i = 0; i < diziBoyut; i++) {
            hashTable[i] = new dugum();
            hashTable[i].key = -1;
        }

        for (int i = 0; i < diziBoyut; i++) {
            Random random = new Random();
            key = 100 + random.nextInt(1000);

            index = key % diziBoyut;
            dugum newDugum = new dugum(key, index);

            if (hashTable[index].key >= 0) {
                newDugum.next = hashTable[index];
                hashTable[index] = newDugum;
            } else {
                hashTable[index] = newDugum;
            }

        }

        for (int i = 0; i < diziBoyut; i++) {
            if (hashTable[i].next == null) {
                System.out.println(hashTable[i].key);
            } else {
                dugum temp = hashTable[i];
                while (temp.next != null) {

                    System.out.print(temp.key + " ");
                    temp = temp.next;
                }
            }
        }

    }
}