public class araba{
    private String renk;
    private String marka;
    private String model;
    private int sene;

    /*public void setModel(String modelasd){
        modelasd = model;
    }*/
    public void setModel(String model){
        this.model = model;
    }
    public String getmodel(){
        return model;
    }
    public void setSene(int yil){
        sene  = yil;
    }
    public int getSene(){
        return sene;
    }
    public void setMarka(String marka){
        this.marka =  marka;
    }
    public String getMarka(){
        return marka;
    }

}