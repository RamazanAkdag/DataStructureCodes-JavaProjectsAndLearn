public class AvlNode {
    int data;
    int height;
    AvlNode left;
    AvlNode right;

    public AvlNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.height = 1;
    }

}
