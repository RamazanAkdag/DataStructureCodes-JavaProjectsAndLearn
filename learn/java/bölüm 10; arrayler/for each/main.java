public class main{
    public static void main(String[] args){
        String[] ramo = {"ramo","selo","huso"};
      /* for(String a : ramo){
            System.out.println(a);
        }*/
        deneme[] a2 = {new deneme("ahmet"),new deneme("ramo"),new deneme("mami")};
        for(deneme b : a2){
            b.yaz();
        }
    }
}