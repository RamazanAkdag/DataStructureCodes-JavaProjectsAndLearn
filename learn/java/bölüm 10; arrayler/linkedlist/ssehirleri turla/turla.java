import java.util.LinkedList;
import java.util.ListIterator;

public class turla{
    public static void sirali_ekle(LinkedList<String> sehir,String yeni){
        ListIterator<String> ramo = sehir.listIterator();
        //ramo.previous();

        while(ramo.hasNext()){
            
            int karsilastir = ramo.next().compareTo(yeni);
            
            if(karsilastir == 0){
                System.out.println("sehir listenizde mevcut");return;
            }else if(karsilastir < 0 ){

            }else if(karsilastir > 0){
                ramo.previous();
                ramo.add(yeni);
                return;
            }
            
        }
        ramo.add(yeni);
    }
   
    public static void bastir(LinkedList<String> sehir){
        for(String a : sehir){
            System.out.println(a);
        }
    }
   
    
    public static void main(String[] args) {
        LinkedList<String> sehirler = new LinkedList<String>();
        sehirler.add("Istanbul");
        sehirler.add("izmir");
        sehirler.add("corum");
        sehirler.add("trabzon");
        sehirler.add("eskisehir");

System.out.println("____________________");
       
        
        
        bastir(sehirler);
System.out.println("____________________");
        sirali_ekle(sehirler, "ankara");

        bastir(sehirler);
       


    }







}