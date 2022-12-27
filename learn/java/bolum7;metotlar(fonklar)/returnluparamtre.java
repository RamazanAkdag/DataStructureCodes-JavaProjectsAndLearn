public class returnluparamtre{
  public static int ramo(int a,int b){
      if(b<= 0){
          return 1;
      }else{
          return a*ramo(a,b-1);
      }
  }
    
    
    public static void main(String[] args){
        System.out.println("sonuc : " + ramo(2,4));
        
    }
}