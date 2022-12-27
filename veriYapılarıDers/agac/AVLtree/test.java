public class test {
    public static void main(String[] args) {
        AVL avltree = new AVL();

        // avltree.insertNode(5);
        avltree.insertNode(90);
        avltree.insertNode(200);
        avltree.insertNode(80);
        avltree.insertNode(70);
        avltree.insertNode(85);
        avltree.insertNode(88);

        avltree.print();

        avltree.deleteNode(avltree.root, 70);
        avltree.deleteNode(avltree.root, 80);
        avltree.deleteNode(avltree.root, 90);

        System.out.println("****************************** \n");

        avltree.print();

        avltree.deleteNode(avltree.root, 88);
        System.out.println("****************************** \n");

        avltree.print();

    }

}
