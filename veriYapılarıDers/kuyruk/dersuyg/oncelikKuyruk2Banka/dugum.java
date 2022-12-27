public class dugum {
    public dugum next;
    public String name;
    public int priority;

    public dugum(String name, int priority) {
        this.name = name;
        this.priority = priority;
        this.next = null;
    }
}