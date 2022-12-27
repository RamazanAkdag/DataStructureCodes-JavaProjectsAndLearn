public class dugum {
    public dugum next;
    public int key;
    int index;

    public dugum(int key, int index) {
        this.next = null;
        this.key = key;
        this.index = index;

    }

    public dugum() {
        this.key = 0;
        this.index = 0;
        this.next = null;
    }

}