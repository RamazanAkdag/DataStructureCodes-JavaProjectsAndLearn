public class yurtdisi implements cıkısislem{
    private String ad = "ramo";
    private String tc_kimlik_no = "şemo";
    private int covid_asisi;
    private boolean sabika_kaydi;
    private boolean denetimli_serbestlik_durumu;
    
    public yurtdisi(String ad, String tc_kimlik_no, int covid_asisi, boolean sabika_kaydi,
            boolean denetimli_serbestlik_durumu) {
        this.ad = ad;
        this.tc_kimlik_no = tc_kimlik_no;
        this.covid_asisi = covid_asisi;
        this.sabika_kaydi = sabika_kaydi;
        this.denetimli_serbestlik_durumu = denetimli_serbestlik_durumu;
    }

    @Override
    public boolean covid_asisi() {
        if(covid_asisi >= 2){
            return true;
        }else{
        return false;
    }
    }

    @Override
    public boolean denetimli_serbestlik_durumu() {
        if(denetimli_serbestlik_durumu){//false donerse yurtdısına cıkamaz
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public void pasaport_bilgileri() {
        System.out.println("isim : "+ ad);
        System.out.println("tc kimlik no : " + tc_kimlik_no);
    }

    @Override
    public boolean sabika_kaydi() {
        if(sabika_kaydi){
        return false;}
        else{
            return true;
        }
    }

    @Override
    public String sonuc() {
        if(!ad.equals("ramo")||!tc_kimlik_no.equals("şemo")||covid_asisi()||denetimli_serbestlik_durumu () ||sabika_kaydi()){
            return "yurtdısına cıkabilir";
        }else{
            return "yurtdısına cıkamaz";
        }

       
    }

}

