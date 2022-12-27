import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class expTree {
    public Node root;

    public expTree() {
        this.root = null;
    }

    /*
     * postfix bir ifadeyi alıp (stack kullanarak) ikili agaca donusturen fonku
     * kodla
     */
    public boolean isNumber(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/') {
            return false;
        }
        return true;
    }

    public void postfix2ExpTree(String sub) {
        Stack<Node> stack = new Stack<>();

        for (int i = 0; i < sub.length(); i++) {
            char kr = sub.charAt(i);
            if (isNumber(kr)) {
                Node s1 = new Node(kr);
                stack.push(s1);
            } else {
                Node s1 = new Node(kr);
                s1.rightChild = stack.pop();
                s1.leftChild = stack.pop();

                stack.push(s1);
            }

        }
        this.root = stack.pop();
    }

    public void printPosTree() {
        postOrderPrint(this.root);
    }

    public void printPreTree() {
        preOrderPrint(this.root);
    }

    public void printInTree() {
        inOrderPrint(this.root);
    }

    public void postOrderPrint(Node tempRoot) {
        if (tempRoot != null) {
            postOrderPrint(tempRoot.leftChild);
            postOrderPrint(tempRoot.rightChild);
            tempRoot.displayNode();
        }
    }

    public void preOrderPrint(Node tempRoot) {
        if (tempRoot != null) {
            tempRoot.displayNode();
            preOrderPrint(tempRoot.leftChild);
            preOrderPrint(tempRoot.rightChild);
        }
    }

    public void inOrderPrint(Node tempRoot) {
        if (tempRoot != null) {
            inOrderPrint(tempRoot.leftChild);
            tempRoot.displayNode();
            inOrderPrint(tempRoot.rightChild);
        }
    }

    public void printLevelTree() {
        levelOrderPrint();
    }

    public void levelOrderPrint() {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(this.root);
        while (!q.isEmpty()) {
            Node kr = q.peek();
            System.out.print(kr.data + " ");
            if (kr.leftChild != null) {
                q.add(kr.leftChild);
            }
            if (kr.rightChild != null) {
                q.add(kr.rightChild);
            }
            q.poll();

        }
    }
}
