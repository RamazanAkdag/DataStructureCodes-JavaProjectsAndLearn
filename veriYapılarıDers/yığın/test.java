public class test {
    public static void main(String[] args) {
        stackDizi stack = new stackDizi(5);
        stack.push(24);
        stack.push(12);
        stack.push(18);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}