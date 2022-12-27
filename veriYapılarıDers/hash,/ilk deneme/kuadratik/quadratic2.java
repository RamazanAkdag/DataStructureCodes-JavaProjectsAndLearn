import java.util.Random;

public class quadratic2 {
    public static int key2index(int key, int arraySize) {
        return key % arraySize;
    }

    public static void main(String[] args) {
        int key, index;
        int arraySize = 100;
        int[] hashTable = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            hashTable[i] = -1;
        }

        for (int i = 0; i < arraySize; i++) {
            Random r = new Random();
            key = 10000 + r.nextInt(90000);
            index = key2index(key, arraySize);

            if (hashTable[index] < 0) {
                hashTable[index] = key;
            } else {
                int k = 1;
                while (hashTable[(index + k * k) % arraySize] >= 0 && k < 45000) {

                    k++;
                }
                if (k >= 45000) {
                    k = 1;
                    while (hashTable[(index + k) % arraySize] > 0) {

                        k++;
                    }
                    hashTable[(index + k) % arraySize] = key;
                } else {

                    int newIndex = (index + k * k) % arraySize;
                    hashTable[newIndex] = key;
                }
            }

        }

        for (int i = 0; i < arraySize; i++) {
            System.out.println(hashTable[i]);
        }
    }
}