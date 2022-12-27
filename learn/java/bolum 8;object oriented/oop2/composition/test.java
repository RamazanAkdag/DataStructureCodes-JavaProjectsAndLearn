public class test{
    public static void main(String[] args){
        resolution resolution = new resolution(1920 , 1080);
        monitor monitor = new monitor("VS197DE", "asus" , "17inc", resolution);
        kasa kasa =new kasa("shadow blade", "Shadow","temperli cam");
        anakart anakart  = new anakart("b250-pro", "asus", 10 , "windows 10");
        bilgisayar pc = new bilgisayar(monitor, kasa, anakart);

        //pc.getKasa().pcyiAc();
        //pc.getMonitor().monitoruKapat();
        pc.getAnakart().getIsletimSistemi("windows 8");

    }
}