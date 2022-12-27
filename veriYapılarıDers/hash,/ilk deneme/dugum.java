public class dugum {
    dugum bas;
    dugum next;
    int pass;

    public dugum(int pass) {
        this.bas = null;
        this.next = null;
        this.pass = pass;
    }

    public void basaEkle(int pass) {
        dugum newDugum = new dugum(pass);
        if (bas == null) {
            this.bas = newDugum;

        } else {
            newDugum.next = bas;
            this.bas = newDugum;
        }
    }

}