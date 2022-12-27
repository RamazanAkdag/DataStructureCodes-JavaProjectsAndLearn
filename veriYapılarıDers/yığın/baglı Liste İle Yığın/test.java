public class test {
    public static boolean control(String ifade) {
        stack ctrl = new stack(100);
        char simdiki;
        char son;
        for (int i = 0; i < ifade.length(); i++) {
            simdiki = ifade.charAt(i);
            if (simdiki == '(' || simdiki == '{' || simdiki == '[') {
                ctrl.veriEkle(simdiki);

            }
            son = simdiki;
            if (simdiki == ')' || simdiki == '}' || simdiki == ']') {
                if (simdiki == ')' && son == '(' || simdiki == '}' && son == '{' || simdiki == ']' && son == '[') {
                    ctrl.cek();
                }
            }
        }
        if (ctrl.top == null) {
            System.out.println("dogru");
            return true;
        } else {
            System.out.println("hatali");
            return false;
        }
    }

    public static void main(String[] args) {
        // stack stack = new stack(5);
        /*
         * stack.veriEkle("ramo()");
         * stack.veriEkle("beko(");
         * stack.veriEkle("şabo(){}");
         */

        String ifade = "()";
        // String ifade3 = "((8-5)/(4+3))*5";
        // String ifade4 = "(){}";
        // String ifade5 = "()((){}";

        // stack.veriEkle(ifade2);
        // stack.veriEkle(ifade3);
        // stack.veriEkle(ifade4);
        // stack.veriEkle(ifade5);

        control(ifade);

        /*
         * System.out.println(stack.cek());
         * System.out.println(stack.cek());
         * System.out.println(stack.cek());
         * System.out.println(stack.bosMu());
         */
    }
}