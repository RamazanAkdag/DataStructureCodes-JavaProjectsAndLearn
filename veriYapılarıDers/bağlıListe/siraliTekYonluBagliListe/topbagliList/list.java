public class list {
    public node head;

    public list() {
        this.head = null;
    }

    public void add(String data) {
        node newNode = new node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            node temp = head;

            while (temp.next != head) {
                if (temp.next == null) {
                    head.next = newNode;
                    newNode.next = head;
                    return;
                }
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;

        }
    }

    public void printDoubleTime() {
        int s = 0;
        if (isEmpty()) {
            System.out.println("list is empty");
        } else {
            node temp = head;
            while (true) {
                if (temp == head) {
                    s++;
                }
                if (s == 3) {
                    break;
                }
                System.out.println(temp.data);
                temp = temp.next;
            }

        }
    }

    public boolean isThere(String data) {
        if (isEmpty()) {
            return false;
        }
        node temp = head;
        while (temp.next != head) {
            if (temp.data.equals(data)) {
                return true;
            }

            temp = temp.next;
        }
        if (temp.data.equals(data)) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public void del(String data) {
        if (isThere(data)) {
            node temp = head;
            if (head.data.equals(data)) {

                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = head.next;
                head = head.next;
            } else {
                while (!temp.next.data.equals(data)) {
                    temp = temp.next;

                }

                if (temp.next.next == head) {
                    temp.next = head;
                    return;
                } else {

                    temp.next = temp.next.next;
                }
            }
        } else {
            return;
        }
    }

    public void add2after(String afterData, String data) {
        node newNode = new node(data);

        if (isThere(afterData)) {
            node temp = head;
            while (temp.data != afterData) {

                temp = temp.next;
            }
            if (temp.next == head) {
                newNode.next = head;
                temp.next = newNode;
            } else {

                newNode.next = temp.next;
                temp.next = newNode;
            }
        } else {
            return;
        }

    }

    public void addAfterIndex(int index, String data) {
        node newNode = new node(data);
        if (isEmpty()) {
            return;
        } else {
            int s = 1;
            node temp = head;
            while (s != index) {
                if (temp == head) {
                    return;
                }
                s++;
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            node temp = head;
            while (temp.next != head) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);

        }

    }

}