import java.lang.reflect.GenericSignatureFormatError;

public class test{
    public static void main(String[] args){
        //araba.java classında hepsi public olunca direk erisim saglayabiliyoruz asagidaki gibi...
        /*araba merso = new araba();
            merso.renk = "kirmizi";
            merso.model = "GTR 3080 drive";
            merso.sene = 2022;
            merso.marka = "NISSAN";
        araba reno = new araba();*/
        araba reno = new araba();
        reno.setModel("megane 3 TSI");
        reno.setSene(2009);
        reno.setMarka("Renault");

        System.out.println("aracin yapim yili : " + reno.getSene());
        System.out.println("aracin markasi : " + reno.getMarka());
        System.out.println("aracin modeli : " + reno.getmodel());

        
    }
}