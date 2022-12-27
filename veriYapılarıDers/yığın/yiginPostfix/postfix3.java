import java.util.Stack;

public class postfix3 {
    public static int oncelik(char c) {
        switch (c) {

            case '+':

            case '-':
                return 1;

            case '*':

            case '/':
                return 2;
        }
        return -1;

    }

    public static void postfixYaz(String ifade) {
        String sonuc = "";
        char kr;
        Stack stack = new Stack();
        for (int i = 0; i < ifade.length(); i++) {
            kr = ifade.charAt(i);
            if (oncelik(kr) > 0 || kr == '(' || kr == ')') {
                if (kr == '(') {
                    stack.push(kr);

                } else if (kr == ')') {
                    while ((char) stack.peek() != '(') {
                        sonuc += stack.pop();
                    }
                    stack.pop();
                }

                else if (!stack.isEmpty() && oncelik((char) stack.peek()) > oncelik(kr)) {
                    sonuc += stack.pop();
                    stack.push(kr);
                } else {
                    stack.push(kr);
                }

            } else {

                sonuc += kr;
            }
        }
        while (!stack.isEmpty()) {

            sonuc += stack.pop();
        }

        System.out.println(sonuc);
    }

    public static void main(String[] args) {
        String ramo = "(3+5)*(7+8/3)";

        postfixYaz(ramo);
    }
}