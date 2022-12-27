public class test {
    public static void main(String[] args) {
        expTree t = new expTree();

        t.postfix2ExpTree("23*84/+");

        t.printPosTree();
        System.out.println();
        t.printPreTree();
        System.out.println();
        t.printInTree();
        System.out.println();
        t.printLevelTree();
        System.out.println();

    }

}
