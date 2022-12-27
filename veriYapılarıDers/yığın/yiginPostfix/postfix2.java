
import java.util.Stack;

public class postfix2 {
    public static int oncelik(char c) {
        switch (c) {
            case '+':

            case '-':
                return 1;

            case '*':

            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    public static String postfixYaz(String ifade) {
        Stack stack = new Stack();
        String sonuc = "";
        char kr;
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
                } else if (!stack.isEmpty() && oncelik((char) stack.peek()) > oncelik(kr)) {
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
        return sonuc;
    }

    public static String reverse(String a) {
        Stack stack = new Stack();
        String b = "";
        for (int i = 0; i < a.length(); i++) {
            stack.push(a.charAt(i));
        }
        for (int i = 0; i < a.length(); i++) {
            if ((char) stack.peek() == '(') {
                b += ')';
                stack.pop();
            } else if ((char) stack.peek() == ')') {
                b += '(';
                stack.pop();
            } else {
                b += (char) stack.pop();
            }
        }

        return b;
    }

    public static void in2pre(String infix) {
        String a = reverse(infix);

        String b = postfixYaz(a);

        System.out.println(reverse(b));

    }

    public static int isaret_Sayi(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
            return 1;
        } else {
            return 0;
        }
    }

    public static int islem(int a, int b, char opr) {
        switch (opr) {
            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                return a / b;

            case '^':
                for (int i = 1; i <= b; i++) {
                    a = a * a;
                }
                return a;

        }
        return 0;
    }

    public static void postfixHesap(String ifade) {
        Stack stack = new Stack<Integer>();
        char kr;
        int sonuc = 0;
        for (int i = 0; i < ifade.length(); i++) {
            kr = ifade.charAt(i);
            String temp = String.valueOf(kr);
            if (isaret_Sayi(kr) == 1) {
                sonuc = islem((int) stack.pop(), (int) stack.pop(), kr);
                stack.push(sonuc);
            }

            else {

                stack.push(Integer.parseInt(temp));

            }

        }
        System.out.println(sonuc);
    }

    public static void main(String[] args) {
        String ramo = "(3*5)+(5+7*8)";
        String Beko = "3*4+5";
        String mami = "3+4*7-8";

        postfixHesap(postfixYaz(ramo));
        // postfixYaz(ramo);

        // in2pre(ramo);
    }
}