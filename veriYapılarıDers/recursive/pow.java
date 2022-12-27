public class pow {

    public static int fact(int val) {
        if (val == 1 || val == 0) {
            return 1;
        }
        if (val < 0) {
            return val;
        }

        return val * fact(val - 1);
    }

    static int islem3 = 0;

    public static double power(int a, int b) {
        if (b == 0) {
            return 1.0;
        } else if (b == 1) {
            return (double) a;
        } else if (b < 0) {
            double k = 1 / power(a, b * -1);
            return k;
        } else if (b % 2 == 0) {
            double k = (double) power(a, b / 2);
            return k * k;
        } else {
            double k = (double) a * power(a, b - 1);
            return k;
        }
    }

    public static double powerIteration(int a, int b) {
        if (b == 0) {
            return 1.0;
        } else if (b == 1) {
            return (double) a;
        } else {
            double sonuc = 1.0;
            for (int i = 0; i < Math.abs(b); i++) {
                sonuc = sonuc * a;
            }
            if (b > 0) {
                return sonuc;
            } else {
                return 1 / sonuc;
            }
        }
    }

    static int islem = 0;

    public static int fibArray(int k) {
        if (k == 0 || k == 1) {
            islem++;
            return 1;
        }
        islem++;
        return fibArray(k - 1) + fibArray(k - 2);
    }

    static int islem2 = 0;

    public static int fibArrayIterative(int val) {
        int[] array = new int[val + 1];
        array[0] = 1;
        array[1] = 1;
        islem2 = 2;
        for (int i = 2; i <= val; i++) {
            array[i] = array[i - 1] + array[i - 2];
            islem2++;
        }
        return array[val];
    }

    public static int factIteration(int val) {
        if (val == 0 || val == 1) {
            return 1;
        } else if (val < 0) {
            return val;
        } else {
            int sonuc = 1;
            for (int i = val; i > 0; i--) {
                sonuc *= i;
            }
            return sonuc;
        }
    }

    public static void main(String[] args) {
        System.out.println("recursive us alma :");
        System.out.println(power(3, 2));
        System.out.println(power(3, -2));
        // System.out.println("islem : " + islem3);
        System.out.println();

        System.out.println("iterative us alma : ");
        System.out.println(powerIteration(3, 2));
        System.out.println(powerIteration(3, -2));

        System.out.println();

        System.out.println("recursive fact alma : ");
        System.out.println(fact(5));

        System.out.println();

        System.out.println("iterative fact alma : ");
        System.out.println(factIteration(5));

        System.out.println();

        System.out.println("recursive fibonacci ve islem sayısı");
        System.out.println(fibArray(40));
        System.out.println("yapılan islem sayisi : " + islem);

        System.out.println();

        System.out.println("iterative fibonacci ve islem sayisi : ");
        System.out.println(fibArrayIterative(40));
        System.out.println("iterative yapılan islem sayisi : " + islem2);

    }
}