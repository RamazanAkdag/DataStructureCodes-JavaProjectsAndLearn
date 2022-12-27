public class ikiYonluList {
    public dugum ilk;

    public ikiYonluList() {
        this.ilk = null;
    }

    public void basaEkle(String eklencek) {
        dugum newDugum = new dugum();
        newDugum.veri = eklencek;
        if (ilk == null) {
            ilk = newDugum;
        } else {
            newDugum.sonraki = ilk;
            ilk = newDugum;
        }

    }

    public void sonaEkle(String eklencek) {

        dugum newDugum = new dugum();
        newDugum.veri = eklencek;
        if (ilk == null) {
            ilk = newDugum;
            return;
        }
        dugum temp = ilk;

        while (temp.sonraki != null) {
            temp = temp.sonraki;
        }

        temp.sonraki = newDugum;
        newDugum.onceki = temp;

    }

    public void bastanYazListe() {
        dugum temp = ilk;

        while (temp.sonraki != null) {
            System.out.println(temp.veri);
            temp = temp.sonraki;
        }
        System.out.println(temp.veri);
    }

    public void elemanSil(String silinecek) {
        dugum temp = ilk;
        while (temp.sonraki != null) {
            if (temp.veri.equals(silinecek)) {
                dugum temp2 = temp;
                temp = temp.onceki;
                temp.sonraki = temp2.sonraki;
                return;
            }
            temp = temp.sonraki;
        }
    }

    public void sondanYazListe() {
        dugum temp = ilk;
        while (temp.sonraki != null) {
            temp = temp.sonraki;
        }
        while (temp.onceki != null) {
            System.out.println(temp.veri);
            temp = temp.onceki;
        }
        System.out.println(temp.veri);
    }

}