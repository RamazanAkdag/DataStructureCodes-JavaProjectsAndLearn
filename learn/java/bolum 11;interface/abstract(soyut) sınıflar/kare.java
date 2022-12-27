public class kare extends sekil{
    private int kenar;

    public kare(String isim, int kenar) {
        super(isim);
        this.kenar = kenar;
    }

    public kare(String isim) {
        super(isim);
    }

    @Override
    void alan_hesapla() {
        System.out.println( getIsim() + " objesinin alanı : " + (kenar*kenar));
        
    }




}