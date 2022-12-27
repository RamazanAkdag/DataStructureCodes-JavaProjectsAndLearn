import java.util.Stack;

public class parantezctrl {

    public static boolean control(String ifade) {
        Stack ctrl = new Stack();
        char simdiki;
        char son;
        for (int i = 0; i < ifade.length(); i++) {
            simdiki = ifade.charAt(i);
            if (simdiki == '(' || simdiki == '{' || simdiki == '[') {
                ctrl.push(simdiki);

            }

            if (simdiki == ')' || simdiki == '}' || simdiki == ']') {
                son = (char) ctrl.peek();
                if (simdiki == ')' && son == '(' || simdiki == '}' && son == '{' || simdiki == ']' && son == '[') {
                    ctrl.pop();
                } else {
                    System.out.println("hatali");
                    return false;
                }
            } else {
                continue;
            }
        }
        if (ctrl.isEmpty()) {
            System.out.println("dogru");
            return true;
        } else {
            System.out.println("hatali");
            return false;
        }
    }

    public static void main(String[] args) {

        control("(8+5)*([4/3]-{5-1)");
    }
}