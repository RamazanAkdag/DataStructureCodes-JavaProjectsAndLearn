import java.util.Stack;

public class parantez2 {
    public static boolean ctrl(String val) {
        char kr;
        Stack stack = new Stack();
        for (int i = 0; i < val.length(); i++) {
            kr = val.charAt(i);
            if (kr == '(' || kr == '{' || kr == '[') {
                stack.push(kr);
            }

            else if (!stack.isEmpty() && (char) stack.peek() == '(' && kr == ')'
                    || (char) stack.peek() == '{' && kr == '}' || (char) stack.peek() == '[' && kr == ']') {
                stack.pop();
            }

        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        String ramo = "()[(oeweoeo)]";
        System.out.println(ctrl(ramo));
    }
}