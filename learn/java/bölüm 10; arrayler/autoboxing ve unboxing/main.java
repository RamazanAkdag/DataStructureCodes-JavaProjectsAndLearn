import java.util.ArrayList;

public class main{
    public static void main(String[] args) {
        /*arraylist olarak tanımlarken int double gibi ifadeleri <int>  veya <double> kullanamayız cunku bunlar ilkel veri tipleridir.
        eger int tipinde verileri tutacak bir arraylist olusturmak istersen 
        int - Integer
        boolean - Boolean
        char - Character
        double - Double
        seklinde <....> ifadesinin icine boyle yazilmasi gerekir...
        örn.
        ArrayList<Integer> selo =  new ArrayList<Integer>();

        yani aslında bunları ilkel veri tipleri seklinde degilde kendi classının ismiile arraylistin icinde tanımlamıs oluyoruz.


         */
        //ArrayList<String> ramo =new ArrayList<String>();
        Integer a = 5;//burada Integer bir class oldugu icin a. ifadesini kulanınca ınteger sınıfındaki butun metotlar karsımıza gelecektir.
        int b = 4;//buradaki int ilkel veri tipi oldugundan b.  gibi bir ifade kullandıgımızda karsımıza hicbir ifade vermeyecektir..
        
      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
        ArrayList<Integer> selo =  new ArrayList<Integer>();
     /* for(int i=0;i<10;i++){//autoboxing
          selo.add(Integer.valueOf(i*4));
      }
     
      for(int i=0; i< selo.size() ;i++ ){//unboxing
        System.out.println(selo.get(i).intValue());
      }*/


    }
}