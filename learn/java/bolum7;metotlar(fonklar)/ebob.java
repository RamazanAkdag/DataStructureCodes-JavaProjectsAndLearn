public class ebob{

    public static int ebobbulma(int s1,int s2) {
        int ebob =1;
        for(int i = 1 ; i<= s1 && i<= s2 ; i++){
            if((s1%i == 0) && (s2%i == 0)){
                ebob = i;
            }
        }
        return ebob;
    }
    public static void main(String[] args){
        System.out.println("sonuc = " + ebobbulma(120, 8));




    }
}