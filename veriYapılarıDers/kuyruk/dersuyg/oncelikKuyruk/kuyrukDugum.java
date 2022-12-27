public class kuyrukDugum {
    private kuyrukDugum next;
    private String veri;
    public int oncelik;

    public kuyrukDugum(String veri, int oncelik) {
        this.oncelik = oncelik;
        this.veri = veri;
    }

    public kuyrukDugum() {
        this.next = null;
    }

    public kuyrukDugum getNext() {
        return next;
    }

    public void setNext(kuyrukDugum next) {
        this.next = next;
    }

    public String getVeri() {
        return veri;
    }

    public void setVeri(String veri) {
        this.veri = veri;
    }

}