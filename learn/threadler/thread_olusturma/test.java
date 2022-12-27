package thread_olusturma;

public class test {
    public static void main(String[] args) {
        printer pr1 = new printer("printer1");
        printer pr2 = new printer("printer2");

        pr1.start();
        pr2.start();
    }

}
