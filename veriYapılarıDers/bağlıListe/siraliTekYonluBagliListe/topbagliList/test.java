public class test {
    public static void main(String[] args) {
        list list = new list();

        list.add("ramo");
        list.add("beko");
        list.add("mami");
        list.add("celo");
        list.add2after("ramo", "adem");
        list.del("celo");

        list.printDoubleTime();
        // list.printList();
    }
}
