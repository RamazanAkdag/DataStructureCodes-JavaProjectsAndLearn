import javax.sql.rowset.spi.SyncResolver;

public class bagliHash {
    public static dugum[] keyPlacer(int pass, dugum[] hashTable) {
        int key = pass % 5;
        if (hashTable[key] == null) {
            hashTable[key] = new dugum(pass);
            hashTable[key].basaEkle(pass);
        } else {
            hashTable[key].basaEkle(pass);
        }

        return hashTable;
    }

    public static void yaz(dugum[] hashTable) {
        for (int i = 0; i < 5; i++) {

            dugum temp = hashTable[i];
            while (temp.next != null) {
                System.out.print(temp.pass);
                temp = temp.next;
            }

        }
    }

    public static void main(String[] args) {
        dugum[] hashTable = new dugum[5];

        keyPlacer(123, hashTable);
        keyPlacer(124, hashTable);
        keyPlacer(125, hashTable);
        keyPlacer(126, hashTable);
        keyPlacer(133, hashTable);
        keyPlacer(143, hashTable);
        hashTable = keyPlacer(153, hashTable);

        yaz(hashTable);

    }
}