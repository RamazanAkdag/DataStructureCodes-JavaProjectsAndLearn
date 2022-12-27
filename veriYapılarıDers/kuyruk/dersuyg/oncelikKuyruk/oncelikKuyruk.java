public class oncelikKuyruk {
    private kuyrukDugum ilk;
    private kuyrukDugum son;
    private int sayac = 0;

    public oncelikKuyruk() {
        this.ilk = null;
        this.son = null;

    }

    public kuyrukDugum getIlk() {
        return ilk;
    }

    public void setIlk(kuyrukDugum ilk) {
        this.ilk = ilk;
    }

    public kuyrukDugum getSon() {
        return son;
    }

    public void setSon(kuyrukDugum son) {
        this.son = son;
    }

    public int getSayac() {
        return sayac;
    }

    public void setSayac(int sayac) {
        this.sayac = sayac;
    }

    public void siraEkle(String isim, int oncelik) {
        kuyrukDugum newDugum = new kuyrukDugum(isim, oncelik);

        if (bosMu()) {
            sayac++;
            ilk = newDugum;
            son = newDugum;
            son.setNext(ilk);
        } else {
            kuyrukDugum temp = ilk;
            if (newDugum.oncelik > ilk.oncelik) {
                newDugum.setNext(ilk);
                ilk = newDugum;
                return;
            }
            while (temp.getNext() != null && temp.oncelik != newDugum.oncelik) {

                temp = temp.getNext();
            }
            while (temp.getNext() != null && temp.getNext().oncelik == newDugum.oncelik) {

                temp = temp.getNext();
            }
            if (temp.getNext() != null) {
                kuyrukDugum temp2 = temp.getNext();

                temp.setNext(newDugum);
                newDugum.setNext(temp2);

                sayac++;
            } else {
                temp.setNext(newDugum);
                son = newDugum;
                son.setNext(ilk);
                sayac++;
            }

        }

    }

    public boolean varMi(String isim) {
        kuyrukDugum temp = ilk;
        while (temp != null) {
            if (temp.getVeri().equals(isim)) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public void cikar(String isim) {
        if (varMi(isim)) {
            kuyrukDugum temp = ilk;
            if (ilk.getVeri().equals(isim)) {
                ilk = ilk.getNext();
                return;
            }
            while (!temp.getNext().getVeri().equals(isim)) {

                temp = temp.getNext();
            }

            if (temp.getNext().getNext() == null) {
                temp.setNext(null);
                return;
            } else {

                kuyrukDugum temp2 = temp.getNext().getNext();
                temp.setNext(temp2);
                return;
            }
        } else {
            System.out.println(isim + " isimli kimse yok");
        }

    }

    public void yazList() {
        kuyrukDugum temp = ilk;
        int tur = 0;

        while (tur != 3) {

            System.out.println(temp.getVeri());
            temp = temp.getNext();
            if (temp == son) {
                tur++;
            }
        }

    }

    public void cek() {
        if (bosMu()) {
            System.out.println("kuyruk yapısı boş");
        } else {
            setSayac(getSayac() - 1);
            System.out.println(ilk.getVeri());
            setIlk(ilk.getNext());
        }
    }

    public boolean bosMu() {
        if (this.getSayac() == 0) {
            return true;
        } else
            return false;
    }

}