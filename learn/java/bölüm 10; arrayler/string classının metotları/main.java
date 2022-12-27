public class main{
    public static void main(String[] args) {
        String a= "mustafa";

        String b= new String("mustafa");
       /* System.out.println("harf sayisi = " + b.length());//uzunluk fonku
        System.out.println("0. index : " + b.charAt(0));//herhangi bi indexdeki karakter
        System.out.println("son eleman : " + b.charAt(b.length()-1));//son indexdeki karakter*/

        /*for(int i=0;i<b.length();i++){//tek tek yazdırma
            System.out.print(b.charAt(i));
        }*/

        //System.out.println(b.startsWith("mu"));//eger mu string ifadesiyle baslıyorsa true deger donduren boolean fonku
        //System.out.println(b.endsWith("fa"));//eger fa string ifadesiyle bitiyorsa true deger donduren boolean fonku
        //icerisine yazılanla baslamıyor veya bitmiyorsa false deger dondurur.

        //System.out.println(b.indexOf("a"));//icine yazılan stringsel ifadenin kacıncı indexde ilk defa bulundugunu gosterir.

        System.out.println(b.toUpperCase());//butun harfleri buyuk yapar anlık olarak


        /*String a1 = "1923";
        int b1 = Integer.parseInt(a1);//a1 stringini integer degere cevirdi*/

        /*int b1 = 1923;
        String a1 = String.valueOf(b1);//integeri stringe cevirdi
        System.out.println(a1);*/
    

    }
}