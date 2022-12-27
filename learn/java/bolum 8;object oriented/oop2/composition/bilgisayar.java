public class bilgisayar{
    private monitor monitor;
    private kasa kasa;
    private anakart anakart;
    
    
    public bilgisayar(monitor monitor, kasa kasa, anakart anakart) {
        this.monitor = monitor;
        this.kasa = kasa;
        this.anakart = anakart;
    }


    public monitor getMonitor() {
        return monitor;
    }


    public void setMonitor(monitor monitor) {
        this.monitor = monitor;
    }


    public kasa getKasa() {
        return kasa;
    }


    public void setKasa(kasa kasa) {
        this.kasa = kasa;
    }


    public anakart getAnakart() {
        return anakart;
    }


    public void setAnakart(anakart anakart) {
        this.anakart = anakart;
    }
}