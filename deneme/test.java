import java.util.Scanner;;

public class test {

    public static boolean isMnumber(int number) {
        double test = Math.log(number + 1) / Math.log(3);
        int test2 = (int) test;
        double test3 = (double) test2;
        if (test == test3) {
            // çıkan sayı int ise logaritma 3^n - 1 degerine sahip olur
            System.out.println("M");
            return true;
        }

        return false;
    }

    public static boolean isLnumber(int number) {
        int x1 = 2;
        int x2 = 1;
        int z;

        while (x2 <= number) {
            z = x1 + x2;
            x1 = x2;
            x2 = z;

            if (x2 == number) {

                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Scanner scanner = new Scanner(System.in);

        System.out.println("bir sayi giriniz...");
        int sayi = scanner.nextInt();
        if (isMnumber(sayi)) {
            System.out.println(sayi + " sayisi M kategorisindedir...");
        }
        System.out.println("******************");
        if (isLnumber(sayi)) {
            System.out.println(sayi + " sayisi L kategorisindedir");
        }
        System.out.println();
        long endTime = System.nanoTime();
        System.out.println("exec time : " + (endTime - startTime) / 1000000);

    }

}