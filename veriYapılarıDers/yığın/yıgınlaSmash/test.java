public class test {
    public static void main(String[] args) {
        stack stack = new stack(5);
        stack.push(5);
        stack.smash(6);
        stack.smash(4);
        stack.smash(8);
        stack.smash(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}