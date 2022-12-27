public class kuyruk {
    public String[] arr;
    public int size;
    public int sayac;

    public kuyruk(int size) {
        this.size = size;
        this.sayac = -1;
        this.arr = new String[size];
    }

    public void ekle(String eklenicek) {
        if (doluMu()) {
            System.out.println("liste zaten dolu");
        } else {
            sayac++;
            arr[sayac] = eklenicek;
        }
    }

    public void cek() {
        if (bosMu()) {
            System.out.println("liste bos");
        } else {
            System.out.println(arr[0]);
            for (int i = 0; i < sayac; i++) {
                arr[i] = arr[i + 1];
            }
            sayac--;
        }
    }

    public boolean doluMu() {
        return sayac == size;
    }

    public boolean bosMu() {
        return sayac == -1;
    }
}