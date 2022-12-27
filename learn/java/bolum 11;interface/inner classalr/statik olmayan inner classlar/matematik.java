import java.util.Scanner;

public class matematik{
    private double PI = Math.PI;

    public class factorial{//matematik classının icinde inner class tanılamıs olduk

        public void faktoriyel(){
            int a;
            Scanner ramo = new Scanner(System.in);
            a = ramo.nextInt();
            int fak = 1;
            for(int i = 1;i<=a;i++){
                fak *= i; 
            }
            System.out.println(a+ "! : "+fak);
    }
}
    public class asal{
        public boolean asal_mi(){
            Scanner ramo = new Scanner(System.in);
            System.out.println("asal olup olmadıgını sorgulayacagın sayıyı gir...");
            int a = ramo.nextInt();
            for(int i =0;i < a;i++){
                if((a % i) == 0){
                    return false;
                }else{
                    continue;
                }
            }
            //System.out.println(a+" sayısı asal sayıdır...");
            return true;
        }
    }

    public class alan{
        public void daire_alan(int yaricap){//inner classlar icinde bulundukları classın private ozelliklerine kolaylıkla erişebilir.
            System.out.println("dairenin alani : "+ (PI*yaricap*yaricap));
        }
    }

    

}