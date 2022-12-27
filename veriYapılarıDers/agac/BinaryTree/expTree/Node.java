public class Node {
    public char data;
    public Node leftChild;
    public Node rightChild;

    public Node(char data) {
        this.data = data;
        leftChild = null;
        rightChild = null;
    }

    public void displayNode() {
        System.out.print(this.data + " ");
    }

}