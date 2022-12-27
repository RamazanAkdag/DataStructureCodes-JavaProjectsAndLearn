import java.util.Stack;

public class postfix {

    /*
     * public static void prefixYaz(String infix){
     * Stack stack = new Stack();
     * int[] dizi =new int[100];
     * int j=0;
     * for(int i=0;i<infix.length();i++){
     * switch(infix.indexOf(i)){
     * case '(':break;
     * 
     * case ')':System.out.println(stack.pop());break;
     * 
     * case '+':stack.push(infix.indexOf(i));break;
     * 
     * case '-':stack.push(infix.indexOf(i));break;
     * 
     * case '*':
     * 
     * case '/':
     * 
     * default:;break;
     * }
     * }
     * }
     */

    /*
     * public static String postFixYaz(String ifade) {
     * Stack stack = new Stack();
     * 
     * String sonuc = "";
     * 
     * for (int i = 0; i < ifade.length(); i++) {
     * char kr = ifade.charAt(i);
     * 
     * if (kr == '(') {
     * stack.push(kr);
     * 
     * } else if (kr == ')') {
     * 
     * while ((char) stack.peek() != '(') {
     * sonuc = sonuc + stack.pop();
     * }
     * 
     * } else if (kr == '*' && (char) stack.peek() == '+' || kr == '*' && (char)
     * stack.peek() == '-'
     * || kr == '/' && (char) stack.peek() == '+' || kr == '/' && (char)
     * stack.peek() == '-') {
     * sonuc += kr;
     * } else if (kr == '+' || kr == '-' || kr == '*' || kr == '/') {
     * stack.push(kr);
     * 
     * }
     * 
     * else {
     * sonuc += kr;
     * }
     * }
     * 
     * return sonuc;
     * 
     * }
     */

    public static void postfxYaz(String ifade) {
        Stack stack = new Stack();
        String sonuc = "";
        for (int i = 0; i < ifade.length(); i++) {
            char kr = ifade.charAt(i);

            if (kr == '(') {
                while (kr != ')') {
                    kr = ifade.charAt(i);
                    if (kr == '+' || kr == '-' || kr == '*' || kr == '/') {
                        if (!stack.isEmpty() && (char) stack.peek() == '*' && kr == '+'
                                || !stack.isEmpty() && (char) stack.peek() == '*' && kr == '-'
                                || !stack.isEmpty() && (char) stack.peek() == '/' && kr == '+'
                                || !stack.isEmpty() && (char) stack.peek() == '/' && kr == '-') {
                            sonuc = sonuc + stack.pop();
                        } else {
                            stack.push(kr);
                        }
                    } else if (!stack.isEmpty() && kr == '*' && (char) stack.peek() == '+'
                            || !stack.isEmpty() && kr == '*' && (char) stack.peek() == '-'
                            || !stack.isEmpty() && kr == '/' && (char) stack.peek() == '+'
                            || !stack.isEmpty() && kr == '/' && (char) stack.peek() == '-') {
                        sonuc += kr;
                    } else {
                        if (kr == '(' || kr == ')') {

                        } else {
                            sonuc += kr;
                        }
                    }
                    i++;
                }

                while (stack.isEmpty() != true) {
                    sonuc += stack.pop();
                }

            } else {
                if ((char) stack.peek() == '*' && kr == '+' || (char) stack.peek() == '*' && kr == '-'
                        || (char) stack.peek() == '/' && kr == '+' || (char) stack.peek() == '/' && kr == '-') {
                    sonuc += stack.pop();
                } else if (kr == '+' || kr == '-' || kr == '*' || kr == '/') {
                    stack.push(kr);
                } else {
                    sonuc += kr;
                }

            }
        }
        sonuc += stack.pop();

        System.out.println(sonuc);

    }

    public static void main(String[] args) {

        String ramo = "(3+5*7)*(7+8*4)";
        postfxYaz(ramo);

        // System.out.println(postFixYaz(ramo));

    }
}