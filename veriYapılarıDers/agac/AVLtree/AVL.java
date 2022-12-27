public class AVL {
    public AvlNode root = null;

    public int getHeight(AvlNode node) {
        if (node == null)
            return 0;
        else
            return node.height;
    }

    private int getBalance(AvlNode node) {
        if (node == null)
            return 0;
        else
            return getHeight(node.left) - getHeight(node.right);
    }

    private int getMaxHeight(int h, int k) {
        if (h > k)
            return h;
        else
            return k;
    }

    private AvlNode rotateLeft(AvlNode p) {
        AvlNode pRight = p.right;
        AvlNode pRightLeft = pRight.left;

        p.right = pRightLeft;
        pRight.left = p;

        p.height = getMaxHeight(getHeight(p.left), getHeight(p.right)) + 1;
        pRight.height = getMaxHeight(getHeight(pRight.left), getHeight(pRight.right)) + 1;

        if (pRight.left == this.root)
            this.root = pRight;

        return pRight;

    }

    private AvlNode rotateRight(AvlNode p) {
        AvlNode pLeft = p.left;
        AvlNode pLeftRight = pLeft.right;

        p.left = pLeftRight;
        pLeft.right = p;

        p.height = getMaxHeight(getHeight(p.left), getHeight(p.right)) + 1;
        pLeft.height = getMaxHeight(getHeight(pLeft.left), getHeight(pLeft.right)) + 1;

        if (pLeft.right == this.root)
            this.root = pLeft;

        return pLeft;
    }

    public AvlNode insertNode(int data) {
        if (this.root == null) {
            this.root = new AvlNode(data);
            root.height = getMaxHeight(getHeight(root.left), getHeight(root.right)) + 1;
            return this.root;
        } else {
            return insertNode(this.root, data);
        }

    }

    private AvlNode insertNode(AvlNode tempRoot, int value) {
        if (tempRoot == null) {
            return new AvlNode(value);
        }
        if (value < tempRoot.data) {
            tempRoot.left = insertNode(tempRoot.left, value);
        } else {
            tempRoot.right = insertNode(tempRoot.right, value);
        }

        tempRoot.height = getMaxHeight(getHeight(tempRoot.left), getHeight(tempRoot.right)) + 1;

        int balanceFact = getBalance(tempRoot);
        // LL durumu
        if (balanceFact > 1 && getBalance(tempRoot.left) >= 0) {
            rotateRight(tempRoot);
        }
        // RR durumu
        if (balanceFact < -1 && getBalance(tempRoot.right) <= 0) {
            rotateLeft(tempRoot);
        }
        // LR durumu
        if (balanceFact > 1 && getBalance(tempRoot.left) < 0) {
            tempRoot.left = rotateLeft(tempRoot.left);
            rotateRight(tempRoot);
        }
        // RL durumu
        if (balanceFact < -1 && getBalance(tempRoot.right) > 0) {
            tempRoot.right = rotateRight(tempRoot.right);
            rotateLeft(tempRoot);
        }

        return tempRoot;
    }

    public AvlNode maxVal(AvlNode tempRoot) {
        while (tempRoot.right != null) {
            tempRoot = tempRoot.right;
        }
        return tempRoot;
    }

    public AvlNode minVal(AvlNode tempRoot) {
        while (tempRoot.left != null) {
            tempRoot = tempRoot.left;
        }
        return tempRoot;
    }

    private AvlNode beforeDeleting(AvlNode tempRoot, AvlNode deleting) {
        if (deleting.data > tempRoot.data) {
            if (tempRoot.right == deleting) {
                return tempRoot;
            }
            return beforeDeleting(tempRoot.right, deleting);
        } else {
            if (tempRoot.left == deleting) {
                return tempRoot;
            }
            return beforeDeleting(tempRoot.left, deleting);
        }

    }

    public void deleteNode(AvlNode tempRoot, int value) {
        if (value > tempRoot.data) {
            deleteNode(tempRoot.right, value);
        } else if (value < tempRoot.data) {
            deleteNode(tempRoot.left, value);
        }

        if (tempRoot.data == value) {
            AvlNode deleting = tempRoot;
            AvlNode changing;
            int changingData;

            if (deleting.left == null) {
                if (deleting.right == null) {// yaprak düğüm
                    AvlNode beforeDeleting = beforeDeleting(this.root, deleting);
                    if (beforeDeleting.right == deleting)
                        beforeDeleting.right = null;
                    else
                        beforeDeleting.left = null;
                } else {// sadece sag cocugu olan düğüm
                    changing = minVal(deleting.right);
                    changingData = changing.data;
                    deleteNode(this.root, changingData);
                    deleting.data = changingData;

                }
            } else {
                changing = maxVal(deleting.left);
                changingData = changing.data;
                deleteNode(this.root, changingData);
                deleting.data = changingData;
            }

        }

        tempRoot.height = getMaxHeight(getHeight(tempRoot.left), getHeight(tempRoot.right)) + 1;

        int balanceFact = getBalance(tempRoot);
        // LL durumu
        if (balanceFact > 1 && getBalance(tempRoot.left) >= 0) {
            rotateRight(tempRoot);
        }
        // RR durumu
        if (balanceFact < -1 && getBalance(tempRoot.right) <= 0) {
            rotateLeft(tempRoot);
        }
        // LR durumu
        if (balanceFact > 1 && getBalance(tempRoot.left) < 0) {
            tempRoot.left = rotateLeft(tempRoot.left);
            rotateRight(tempRoot);
        }
        // RL durumu
        if (balanceFact < -1 && getBalance(tempRoot.right) > 0) {
            tempRoot.right = rotateRight(tempRoot.right);
            rotateLeft(tempRoot);
        }

    }

    public void print() {
        inOrder(this.root);
    }

    private void inOrder(AvlNode tempRoot) {
        if (tempRoot != null) {
            inOrder(tempRoot.left);
            System.out.println(tempRoot.data);
            inOrder(tempRoot.right);
        }
    }

}