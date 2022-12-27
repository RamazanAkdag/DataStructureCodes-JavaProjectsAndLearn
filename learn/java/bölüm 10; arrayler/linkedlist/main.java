import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class main{
    public static void bastir(LinkedList<String> yerler){
       /* for(String s : yerler){//istersen for each dongusu ile linkedlist bastırabilirsin ama indexler uzerinde isşlemler yapmak icin
                                //ıterator olusturman gerekiyor..
            System.out.println(s);
        }*/
        ListIterator<String> iterator = yerler.listIterator();
                    //hasnext bos elemana gelince 0 veren boolean fonku
        while(iterator.hasNext()){/*iteratorler pointer gibi her bir indexi tutan referanslar gibi*/
            System.out.println(iterator.next());//next fonku bir sonraki indexe gitmeye yariyor...
        }
    }
    public static void sirali_ekle(LinkedList<String> yerler,String yeni){
        ListIterator<String> iterator = yerler.listIterator();

        while(iterator.hasNext()){
            int karsilastir = iterator.next().compareTo(yeni);//compareTo alfabetik sıralamaya yarayan fonksiyon
            if(karsilastir == 0){//iki degerin esit oldugu anlamina geliyor...
                System.out.println("listenizde bu eleman zaten var...");
                return;
            }else if(karsilastir < 0){//yeni deger iterator.next ten daha buyuk demek oluyor..
                

            }else if(karsilastir > 0){
                iterator.previous();
                iterator.add(yeni);
                return;
            }
        }
        iterator.add(yeni);
    }
    public static void main(String[] args) {
        /*ArrayList<String> ramo = new ArrayList<String>();

        ramo.add("C sharp");
        ramo.add("python");;
        ramo.add("java");
        ramo.add("javascript");
        ramo.add("prolog");

        for(String s : ramo){//foreach
            System.out.println(s);
        }

        ramo.add(1,"c++");
        System.out.println("________________________");

        for(String s : ramo){//foreach
            System.out.println(s);
        }

    }*/

    LinkedList<String> gidilecek_yerler = new LinkedList<String>();

    /*gidilecek_yerler.add("market");
    gidilecek_yerler.add("spor salonu");
    gidilecek_yerler.add("ev");
    bastir(gidilecek_yerler);

    System.out.println("_________________");
    gidilecek_yerler.add(1 ,"alısveris merkezi");

    bastir(gidilecek_yerler);*/
    sirali_ekle(gidilecek_yerler, "ev");
    sirali_ekle(gidilecek_yerler, "postane");
    sirali_ekle(gidilecek_yerler, "yenikapı");
    sirali_ekle(gidilecek_yerler,"taksim");

    sirali_ekle(gidilecek_yerler, "urfa");
    bastir(gidilecek_yerler);

}
}