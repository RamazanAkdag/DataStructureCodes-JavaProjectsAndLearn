public class stackDizi {
    public int topOfStack;
    public int capacity;
    public int[] stack;

    public stackDizi(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.topOfStack = -1;
    }

    public void push(int element) {
        if (topOfStack == capacity - 1) {
            System.out.println("overflow");
        } else {
            topOfStack++;
            stack[topOfStack] = element;
        }
    }

    public int pop() {
        if (topOfStack < 0) {
            System.out.println("yığın boş");
            return 0;
        } else {
            int element = stack[topOfStack];
            topOfStack--;
            return element;
        }
    }
}