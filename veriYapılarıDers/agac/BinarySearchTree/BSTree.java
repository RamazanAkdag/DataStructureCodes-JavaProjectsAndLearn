public class BSTree {
    public dugum root = null;

    public void ekle(int veri) {
        dugum newDugum = new dugum(veri);
        if (root == null) {
            root = newDugum;
        } else {
            dugum temp = root;
            while (temp != null) {
                if (temp.data < newDugum.data) {
                    if (temp.right == null) {
                        temp.right = newDugum;
                        return;
                    }
                    temp = temp.right;
                } else if (temp.data > newDugum.data) {
                    if (temp.left == null) {
                        temp.left = newDugum;
                        return;
                    }
                    temp = temp.left;
                }

            }

        }

    }

    // dugum temp = root;

    public void yazTree(dugum temp) {

        if (temp != null) {
            yazTree(temp.left);
            System.out.println(temp.data);
            yazTree(temp.right);
        }

    }

    public void asilYazdir() {

        yazTree(root);
    }
}