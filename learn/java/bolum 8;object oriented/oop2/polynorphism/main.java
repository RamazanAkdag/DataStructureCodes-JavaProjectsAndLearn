class hayvan{
    private String isim;

    public String konus(){
        return "hayvan konusuyor";
    }
    public hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
class kedi extends hayvan{
    public kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
       
        return this.getIsim() + " miyavliyor...";
    }
}
class kopek extends hayvan{
    public kopek(String isim){
        super(isim);
    }
    public String konus(){
        return this.getIsim() + " havliyor...";
    }
}
class at extends hayvan{

    public at(String isim) {
        super(isim);
    }
    public String konus(){
        return this.getIsim() + " kişniyor...";
    }


}
class kus extends hayvan{
    public kus(String isim){
        super(isim);
    }

  
    public String konus() {
        return this.getIsim() + " otuyor...";
    }
    
}
public class main{
    public static void konustur(Object object){//object her classa ait olabilen bir nesne classıdır. javanın içinde default vardır.
        if(object instanceof kedi){
            kedi kedi = (kedi)object;
            System.out.println(kedi.konus());
        }else if(object instanceof kopek){
            kopek kopek = (kopek) object;
            System.out.println(kopek.konus());
        }else if(object instanceof at){
            at at = (at)object;
            System.out.println(at.konus());
        }else if(object instanceof hayvan){
            hayvan hayvan = (hayvan)object;
            System.out.println(hayvan.konus());
        }
    }
    public static void main(String[] args){
       /* hayvan hayvan1 = new kedi("limon");//polymorphism bu işte. Hayvan referansı sanki bir kedi objesiymiş gibi davrandı.
        hayvan hayvan2 = new kopek("karabas");
        hayvan hayvan3 = new at("sahbatur");
        System.out.println(hayvan1.konus());
        System.out.println(hayvan2.konus());
        System.out.println(hayvan3.konus());*/
        
        kopek kopek = new kopek("karabas");
        kedi kedi = new kedi("tekir");
        at at = new at("fırtına");
        kus kus = new kus("selo");
        /*if(kopek instanceof hayvan){//instanceof deyimi eger kopek hayvan sinifina aitse true deger donduren boolean fonku calıstırır.
            System.out.println("hayvan sinifina aittir...");
        }*/

        konustur(kopek);
        konustur(kedi);
        konustur(at);
        konustur(kus);





    }
}