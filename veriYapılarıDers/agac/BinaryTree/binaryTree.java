public class binaryTree {
    public node root;

    public binaryTree() {
        this.root = null;
    }

    // tree adding function
    public void add2Tree(int data) {
        node newNode = new node(data);
        if (this.root == null) {
            this.root = newNode;
            return;
        } else {
            add2Tree(this.root, newNode);
            return;
        }
    }

    public void add2Tree(node tempRoot, node newNode) {
        if (newNode.data > tempRoot.data) {
            if (tempRoot.right == null) {
                tempRoot.right = newNode;
                return;
            }
            add2Tree(tempRoot.right, newNode);

        } else if (newNode.data < tempRoot.data) {
            if (tempRoot.left == null) {
                tempRoot.left = newNode;
            }
            add2Tree(tempRoot.left, newNode);
        }

    }

    // node searching in tree function
    public node searchVal(int value) {
        if (this.root.data == value) {
            return this.root;
        } else {
            return searchVal(this.root, value);
        }
    }

    public node searchVal(node tempRoot, int value) {
        if (tempRoot.data == value) {
            return tempRoot;
        } else if (value > tempRoot.data) {
            if (tempRoot.right == null) {
                return null;
            }
            return searchVal(tempRoot.right, value);
        } else if (value < tempRoot.data) {
            if (tempRoot.left == null) {
                return null;
            }
            return searchVal(tempRoot.left, value);
        }
        return null;
    }
    // going to relavant element functions

    public node beforeDeletingNode(node TempRoot, int value) {
        // silinecek elemanla veriler degistirildikten sonra fazla kalan düğümü
        // yok etmek için ondan bir önceki elemana giden fonksiyon
        if (value > TempRoot.data) {
            if (TempRoot.right.data == value) {
                return TempRoot;
            }
            return beforeDeletingNode(TempRoot.right, value);
        } else if (value < TempRoot.data) {
            if (TempRoot.left.data == value) {
                return TempRoot;
            }
            return beforeDeletingNode(TempRoot.left, value);
        }
        return null;
    }

    public node tempRootMin(node tempRoot) {/* gönderilen düğümün altındaki minimum value yi bulup geri döndürür */
        if (tempRoot.left == null) {
            return tempRoot;
        } else {
            return tempRootMin(tempRoot.left);
        }
    }

    public node tempRootMax(node tempRoot) {/* gönderilen düğümün altındaki maximum value yi bulup geri döndürür */

        if (tempRoot.right == null) {
            return tempRoot;
        } else {
            return tempRootMax(tempRoot.right);
        }

    }

    public void deleteVal(int value) {
        node deletingNode = searchVal(value);
        node replacingNode;
        if (deletingNode == null) {
            return;
        } else {
            if (deletingNode.right == null) {
                if (deletingNode.left == null) {
                    node beforeDeletingNode = beforeDeletingNode(this.root, value);
                    if (beforeDeletingNode.right.data == value) {
                        beforeDeletingNode.right = null;
                        return;
                    } else if (beforeDeletingNode.left.data == value) {
                        beforeDeletingNode.left = null;
                        return;
                    }
                    return;
                } else {
                    replacingNode = tempRootMax(deletingNode.left);
                    int k = replacingNode.data;
                    deleteVal(replacingNode.data);
                    deletingNode.data = k;
                    return;
                }
            } else {
                replacingNode = tempRootMin(deletingNode.right);
                int k = replacingNode.data;
                deleteVal(replacingNode.data);
                deletingNode.data = k;
                return;
            }
        }

    }

    public node maxValInTree() {// bütün ağaçtaki maximum degeri veren fonksiyon
        return tempRootMax(this.root);
    }

    public node minValInTree() {// bütün ağaçtaki minimum degeri veren fonksiyon
        return tempRootMin(this.root);
    }

    public void prinTree() {
        inOrderTreePrinter(this.root);
    }

    public void inOrderTreePrinter(node tempRoot) {
        if (tempRoot != null) {
            inOrderTreePrinter(tempRoot.left);
            System.out.println(tempRoot.data);
            inOrderTreePrinter(tempRoot.right);
        }

    }

}
