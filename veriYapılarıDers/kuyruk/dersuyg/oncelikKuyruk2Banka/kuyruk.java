public class kuyruk {
    public dugum head;
    public dugum tail;

    public kuyruk() {
        this.head = null;
        this.tail = null;
    }

    public void prepend(String name, int priority) {
        dugum newNode = new dugum(name, priority);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        } else {
            if (newNode.priority < head.priority) {
                newNode.next = head;
                head = newNode;
                return;
            }
            if (newNode.priority > tail.priority) {
                tail.next = newNode;
                tail = newNode;
                return;
            }
            dugum temp = head;
            while (temp.next != null && temp.next.priority <= newNode.priority) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void pop() {
        System.out.println(head.name);
        head = head.next;
    }

}