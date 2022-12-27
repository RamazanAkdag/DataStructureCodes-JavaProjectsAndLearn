public class monitor{
    private string model;
    private string uretici;
    private String boyut;
    private resolution resolution;//composition bu oluyor. su an monitor classının icinde resolution classının bir objesini tanimlamis olduk...
    
    public monitor(string model, string uretici, String boyut, resolution resolution) {
        this.model = model;
        this.uretici = uretici;
        this.boyut = boyut;
        this.resolution = resolution;
    }
    public void monitoruKapat(){
        System.out.println("monitor kapatiliyor");
    }

    public string getModel() {
        return model;
    }

    public void setModel(string model) {
        this.model = model;
    }

    public string getUretici() {
        return uretici;
    }

    public void setUretici(string uretici) {
        this.uretici = uretici;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public resolution getResolution() {
        return resolution;
    }

    public void setResolution(resolution resolution) {
        this.resolution = resolution;
    }





}