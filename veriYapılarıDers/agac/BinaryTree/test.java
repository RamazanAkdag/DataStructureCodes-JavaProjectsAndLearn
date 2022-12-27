public class test {
    public static void main(String[] args) {
        binaryTree tree = new binaryTree();
        /*
         * max derinligi ise 2^d -1 dir
         */

        tree.add2Tree(15);
        tree.add2Tree(20);
        tree.add2Tree(18);
        tree.add2Tree(45);
        tree.add2Tree(19);
        tree.add2Tree(30);

        tree.prinTree();
    }
}
