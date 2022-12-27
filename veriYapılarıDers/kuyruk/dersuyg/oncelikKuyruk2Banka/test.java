public class test {
    public static void main(String[] args) {
        kuyruk k = new kuyruk();
        k.prepend("ramazan", 2);
        k.prepend("beko", 1);
        k.prepend("adem", 1);
        k.prepend("celo", 3);
        k.prepend("ahmet", 2);

        k.pop();
        k.pop();
        k.pop();
        k.pop();
        k.pop();

    }
}