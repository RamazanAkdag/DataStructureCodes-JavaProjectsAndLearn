public class stack {
    public listDugum top = null;// en üstteki düüğümü tutan gösterici
    public int size;
    public int sayac = 0;

    public stack(int size) {
        this.size = size;
        this.top = null;
    }

    public char cek() {
        if (bosMu()) {
            return "liste bos";
        } else {
            sayac--;
            listDugum temp = top;
            top = top.next;
            return temp.veri;

        }

    }

    public void veriEkle(char eklenicek) {
        listDugum eleman = new listDugum(eklenicek);
        if (doluMu()) {
            System.out.println("eklenicek veri kalmadi");
        } else {
            if (bosMu()) {
                sayac++;
                top = eleman;
            } else {
                sayac++;
                eleman.next = top;
                top = eleman;
            }
        }

    }

    /*
     * public void ptctrl() {
     * listDugum eleman = top;
     * int sayac;
     * int dugumtutan = 1;
     * while (eleman != null) {
     * sayac = 0;
     * for (int i = 0; i < eleman.veri.length(); i++) {
     * if (eleman.veri.charAt(i) == '(') {
     * sayac++;
     * } else if (eleman.veri.charAt(i) == ')') {
     * sayac--;
     * } else if (eleman.veri.charAt(i) == '{') {
     * sayac++;
     * } else if (eleman.veri.charAt(i) == '{') {
     * sayac--;
     * }
     * }
     * if (sayac == 0) {
     * System.out.println(dugumtutan + ". eleman dogru yazılmış");
     * } else {
     * System.out.println(dugumtutan + ". elemanda parantez hatası var");
     * 
     * }
     * eleman = eleman.next;
     * dugumtutan++;
     * 
     * }
     * }
     */

    public boolean bosMu() {
        if (sayac == 0) {
            return true;
        } else {
            return false;
        }

    }

    public boolean doluMu() {
        if (sayac == size) {
            return true;
        } else {
            return false;
        }
    }
}