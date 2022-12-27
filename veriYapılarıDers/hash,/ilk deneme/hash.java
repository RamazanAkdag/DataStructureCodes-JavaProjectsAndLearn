import java.util.Hashtable;

public class hash {

    public static int[] keyPlacer(int pass, int[] hashTable) {
        int key = pass % 5;

        if (hashTable[key] != 0) {
            int i = key;
            while (i < 5 && hashTable[i] != 0) {
                i++;
            }

            if (i >= 5) {
                i = 0;
                while (hashTable[i] != 0) {
                    i++;
                }
                hashTable[i] = pass;
            } else {
                hashTable[i] = pass;
            }
        } else {
            hashTable[key] = pass;
        }
        return hashTable;
    }

    public static void main(String[] args) {
        int[] hashTable = new int[5];
        for (int i = 0; i < 5; i++) {
            hashTable[i] = 0;
        }
        keyPlacer(123, hashTable);
        keyPlacer(35, hashTable);
        keyPlacer(44, hashTable);
        keyPlacer(3, hashTable);

        hashTable = keyPlacer(21, hashTable);

        for (int i = 0; i < 5; i++) {
            System.out.println(i + " deki :" + hashTable[i]);
        }

    }
}