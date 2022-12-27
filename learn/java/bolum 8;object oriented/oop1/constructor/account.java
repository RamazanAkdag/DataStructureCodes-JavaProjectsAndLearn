

public class account{
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telNo;

//asagidaki ifadeler constructor denir.constructor obje olustruruldugunda calısan komutlardir.
public account(){
    /*hesapNo ="bilgi yok";
    bakiye = 0.0;
    isim = "bilgi yok";
    email ="bilgi yok";
    telNo ="bilgi yok";*/

    //veya
    this("bilgi yok",0.0,"bilgi yok","bilgi yok","bilgi yok");
}
public void yazdir(){
    System.out.println("hesapNo : "+ hesapNo);
    System.out.println("bakiye : " + bakiye);
    System.out.println("isim : " +isim);
    System.out.println("email : "+ email);
    System.out.println("telno : " + telNo);
}
public account(String hesapNo,double bakiye,String isim,String email,String telno){
    this.hesapNo = hesapNo;
    this.bakiye = bakiye;
    this.isim = isim;
    this.telNo = telno;
    this.email = email;

}






    //her seferinde asagidaki kadar uzun fonklar yazmak yerine olusturulan yapilara constructorlar denir.
   public void yatir(double miktar){
        bakiye += miktar;
        System.out.println("yeni bakiye " + bakiye);
    }
    public void cek(double miktar){
        if(miktar > 1500){
            System.out.println("gunluk cekme limiti 1500tl dir...\n");
        }if(miktar > bakiye){
            System.out.println("yetersiz bakiye");
        }
        else{
            bakiye -= miktar;
            System.out.println("yeni bakiye " + bakiye);
        }
    }
/*
    public void sethesapno(String a){
        hesapNo = a;
    }*/
    public String gethesapno(){
        return hesapNo;
    }/*
    public void setbakiye(double b){
      bakiye  = b;       
    }*/
    public double getbakiye(){
        return bakiye;
    }/*
    public void setisim(String c){
        isim = c;       
      }*/
      public String getisim(){
          return isim;
      }/*
      public void setmail(String mail){
        email = mail;       
      }*/
      public String getmail(){
          return email;
      }/*
      public void settel(String no){
        telNo = no;       
      }*/
      public String gettel(){
          return telNo;
      }
}