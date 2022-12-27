public class kuyruk {// ilk giren ilk çıkar
    public listDugum son;
    public listDugum ilk;
    public int size;
    public int sayac;

    public kuyruk(int size) {
        this.size = size;
        this.sayac = 0;
    }

    public void ekle(String eklenicek) {
        listDugum newDugum = new listDugum(eklenicek);
        if (doluMu()) {
            System.out.println("kapasite dolu");
        } else {
            if (bosMu()) {
                sayac++;
                ilk = newDugum;
                son = newDugum;
            } else {
                son.next = newDugum;
                son = newDugum;
                sayac++;
            }
        }

    }

    public void cek() {
        if (bosMu()) {
            System.out.println("liste bos");
        } else {
            sayac--;
            System.out.println(ilk.veri);
            ilk = ilk.next;
        }

    }

    public boolean bosMu() {
        return sayac == 0;
    }

    public boolean doluMu() {
        return sayac == size;
    }

}