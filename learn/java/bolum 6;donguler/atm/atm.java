import java.util.Scanner;
public class atm{
    public static void main(String[] args){
        Scanner ramo = new Scanner(System.in);
        Double bakiye = 1000.0;
        while(true){
            
            System.out.print("yapmak istediginiz islem nedir.\n1 - bakiye ogrenme\n2 - para cekme\n3 -  para yatirma\nq - cikis\n");
          
            
            
            String islem = ramo.nextLine();
            switch(islem){
                case "1" : System.out.println("mevcut bakiyeniz "+ bakiye +" tl'dir...\n");break;

                case "2" : System.out.println("cekmek istediginiz miktari giriniz...\n");
                    Double cekme = ramo.nextDouble();
                    ramo.nextLine();
                    
                    if(bakiye < cekme){
                        System.out.println("hesabinizda "+cekme+" kadar bakiye bulunmamaktadir");break;
                    }else{
                        bakiye -= cekme;
                        System.out.println("para cekme islemi basarili yeni bakiyeniz : "+ bakiye + "\n");break;
                    }
                    
                case "3": System.out.println("yatiracaginiz para miktariniz giriniz...\n");
                        Double yatir  = ramo.nextDouble();
                       ramo.nextLine();

                        bakiye += yatir;
                        System.out.println("para yatirma basarili yeni bakiye " + bakiye+ "\n");break;


                case "q" : System.out.println("programdan cikiliyor...\n");break;

                default : System.out.println("yanlis bir rakam tusladiniz. Tekrar menu ekranina yonlendiriliyorsunuz...\n");break;
            }
        if(islem.equals("q")){
            break;
        }

    }

    System.out.println("bankacilik islemi sonlandi...\n");




    }
}