public class stack {
    public node peek;
    public int size;
    public int say = 0;

    public stack(int size) {
        this.size = size;
        this.peek = null;
    }

    public void push(int data) {
        node newNode = new node(data);
        if (isEmpty()) {
            this.peek = newNode;
        } else {
            newNode.next = peek;
            this.peek = newNode;
        }
    }

    public int peek() {
        return peek.data;
    }

    public int pop() {
        int k = peek.data;
        if (peek.next == null) {
            this.peek = null;
        } else {
            this.peek = peek.next;
        }
        return k;
    }

    public void smash(int data) {

        if (isEmpty()) {
            this.push(data);
        } else if (data <= this.peek()) {
            this.push(data);
        } else {
            int c = this.pop();
            smash(data);
            this.push(c);
        }

    }

    public boolean isEmpty() {
        if (peek == null) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (say == this.size) {
            return true;
        }
        return false;
    }

}
